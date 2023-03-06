package gregtechmod.api.world;

import java.util.Collection;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;

public class GT_Worldgen_Boulder extends GT_Worldgen_Ore {
	public GT_Worldgen_Boulder(String aName, boolean aDefault, int aBlockID, int aBlockMeta, int aDimensionType, int aAmount, int aSize, int aProbability, int aMinY, int aMaxY, Collection<String> aBiomeList, boolean aAllowToGenerateinVoid) {
		super(aName, aDefault, aBlockID, aBlockMeta, aDimensionType, aAmount, aSize, aProbability, aMinY, aMaxY, aBiomeList, aAllowToGenerateinVoid);
	}
	
	@Override
	public boolean executeWorldgen(World aWorld, Random aRandom, String aBiome, int aDimensionType, int aChunkX, int aChunkZ, IChunkProvider aChunkGenerator, IChunkProvider aChunkProvider) {
		if (aDimensionType == mDimensionType && (mBiomeList.isEmpty() || mBiomeList.contains(aBiome)) && (mProbability <= 1 || aRandom.nextInt(mProbability) == 0)) {
			for (int i = 0; i < mAmount; i++) {
				int tX = aChunkX + aRandom.nextInt(16), tY = mMinY + aRandom.nextInt(mMaxY - mMinY), tZ = aChunkZ + aRandom.nextInt(16);
				Block tBlock = Block.blocksList[aWorld.getBlockId(tX, tY - 7, tZ)];
				if (tBlock != null && tBlock.isOpaqueCube() && aWorld.getBlockId(tX, tY-6, tZ) == 0) {
					float var6 = aRandom.nextFloat() * (float)Math.PI;
			        double var7 = (double)((float)(tX + 8) + MathHelper.sin(var6) * (float)mSize / 8.0F);
			        double var9 = (double)((float)(tX + 8) - MathHelper.sin(var6) * (float)mSize / 8.0F);
			        double var11 = (double)((float)(tZ + 8) + MathHelper.cos(var6) * (float)mSize / 8.0F);
			        double var13 = (double)((float)(tZ + 8) - MathHelper.cos(var6) * (float)mSize / 8.0F);
			        double var15 = (double)(tY + aRandom.nextInt(3) - 2);
			        double var17 = (double)(tY + aRandom.nextInt(3) - 2);
			        
			        for (int var19 = 0; var19 <= mSize; ++var19) {
			            double var20 = var7 + (var9 - var7) * (double)var19 / (double)mSize;
			            double var22 = var15 + (var17 - var15) * (double)var19 / (double)mSize;
			            double var24 = var11 + (var13 - var11) * (double)var19 / (double)mSize;
			            double var26 = aRandom.nextDouble() * (double)mSize / 16.0D;
			            double var28 = (double)(MathHelper.sin((float)var19 * (float)Math.PI / (float)mSize) + 1.0F) * var26 + 1.0D;
			            double var30 = (double)(MathHelper.sin((float)var19 * (float)Math.PI / (float)mSize) + 1.0F) * var26 + 1.0D;
			            int var32 = MathHelper.floor_double(var20 - var28 / 2.0D);
			            int var33 = MathHelper.floor_double(var22 - var30 / 2.0D);
			            int var34 = MathHelper.floor_double(var24 - var28 / 2.0D);
			            int var35 = MathHelper.floor_double(var20 + var28 / 2.0D);
			            int var36 = MathHelper.floor_double(var22 + var30 / 2.0D);
			            int var37 = MathHelper.floor_double(var24 + var28 / 2.0D);
			            
			            for (int var38 = var32; var38 <= var35; ++var38) {
			                double var39 = ((double)var38 + 0.5D - var20) / (var28 / 2.0D);
			                if (var39 * var39 < 1.0D) {
			                    for (int var41 = var33; var41 <= var36; ++var41) {
			                        double var42 = ((double)var41 + 0.5D - var22) / (var30 / 2.0D);
			                        if (var39 * var39 + var42 * var42 < 1.0D) {
			                            for (int var44 = var34; var44 <= var37; ++var44) {
			                                double var45 = ((double)var44 + 0.5D - var24) / (var28 / 2.0D);
			                                Block block = Block.blocksList[aWorld.getBlockId(var38, var41, var44)];
			                                if (var39 * var39 + var42 * var42 + var45 * var45 < 1.0D && ((mAllowToGenerateinVoid&&aWorld.getBlockId(var38, var41, var44)==0) || (block != null && !(block instanceof BlockContainer)))) {
			                                    aWorld.setBlock(var38, var41, var44, mBlockID, mBlockMeta, 0);
			                                }
			                            }
			                        }
			                    }
			                }
			            }
			        }
				}
	        }
			return true;
		}
        return false;
	}
}