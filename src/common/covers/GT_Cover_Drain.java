package gregtechmod.common.covers;

import gregtechmod.api.interfaces.ICoverable;
import gregtechmod.api.interfaces.IMachineProgress;
import gregtechmod.api.util.GT_CoverBehavior;
import gregtechmod.api.util.GT_ModHandler;
import gregtechmod.api.util.GT_Utility;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.IFluidBlock;
import net.minecraftforge.fluids.IFluidHandler;

public class GT_Cover_Drain extends GT_CoverBehavior {
	
	public GT_Cover_Drain(ItemStack aStack) {
		super(aStack);
	}
	
	@Override
	public int doCoverThings(byte aSide, byte aInputRedstone, int aCoverID, int aCoverVariable, ICoverable aTileEntity) {
		if (aCoverVariable % 3 > 1 && aTileEntity instanceof IMachineProgress && (((IMachineProgress)aTileEntity).isAllowedToWork() != ((aCoverVariable % 3) < 2))) return aCoverVariable;
		if (aSide != 6) {
			short tID = aTileEntity.getBlockIDAtSide(aSide);
			if (aCoverVariable < 3 && aTileEntity instanceof IFluidHandler) {
				if (aSide == 1) {
					if (aTileEntity.getWorld().isRaining()) {
						if (aTileEntity.getWorld().getPrecipitationHeight(aTileEntity.getXCoord(), aTileEntity.getZCoord()) - 2 < aTileEntity.getYCoord()) {
							int tAmount = (int)(aTileEntity.getBiome(aTileEntity.getXCoord(), aTileEntity.getZCoord()).rainfall*10);
							if (tAmount > 0) {
								((IFluidHandler)aTileEntity).fill(ForgeDirection.getOrientation(aSide), GT_ModHandler.getWater(aTileEntity.getWorld().isThundering()?tAmount*2:tAmount), true);
							}
						}
					}
				}
				FluidStack tLiquid = null;
				if (tID > 0) {
					if ((tID == Block.waterStill.blockID || tID == Block.waterMoving.blockID) && aTileEntity.getMetaIDAtSide(aSide) == 0) {
						tLiquid = GT_ModHandler.getWater(1000);
					} else if ((tID == Block.lavaStill.blockID || tID == Block.lavaMoving.blockID) && aTileEntity.getMetaIDAtSide(aSide) == 0) {
						tLiquid = GT_ModHandler.getLava(1000);
					} else if (Block.blocksList[tID] instanceof IFluidBlock) {
						tLiquid = ((IFluidBlock)Block.blocksList[tID]).drain(aTileEntity.getWorld(), aTileEntity.getOffsetX(aSide, 1), aTileEntity.getOffsetY(aSide, 1), aTileEntity.getOffsetZ(aSide, 1), false);
					}
					if (tLiquid != null && tLiquid.getFluid() != null && (aSide > 1 || (aSide == 0 && tLiquid.getFluid().getDensity() <= 0) || (aSide == 1 && tLiquid.getFluid().getDensity() >= 0))) {
						if (((IFluidHandler)aTileEntity).fill(ForgeDirection.getOrientation(aSide), tLiquid, false) == tLiquid.amount) {
							((IFluidHandler)aTileEntity).fill(ForgeDirection.getOrientation(aSide), tLiquid, true);
							aTileEntity.getWorld().setBlockToAir(aTileEntity.getXCoord() + ForgeDirection.getOrientation(aSide).offsetX, aTileEntity.getYCoord() + ForgeDirection.getOrientation(aSide).offsetY, aTileEntity.getZCoord() + ForgeDirection.getOrientation(aSide).offsetZ);
						}
					}
				}
			}
			if (aCoverVariable >= 3 && tID >= 0) {
				if (tID == Block.lavaStill.blockID || tID == Block.lavaMoving.blockID || tID == Block.waterStill.blockID || tID == Block.waterMoving.blockID || Block.blocksList[tID] instanceof IFluidBlock) {
					aTileEntity.getWorld().setBlock(aTileEntity.getOffsetX(aSide, 1), aTileEntity.getOffsetY(aSide, 1), aTileEntity.getOffsetZ(aSide, 1), 0, 0, 0);
				}
			}
		}
		return aCoverVariable;
	}
	
	@Override
	public int onCoverScrewdriverclick(byte aSide, int aCoverID, int aCoverVariable, ICoverable aTileEntity, EntityPlayer aPlayer, float aX, float aY, float aZ) {
		aCoverVariable=(aCoverVariable+1)%6;
		if (aCoverVariable == 0) GT_Utility.sendChatToPlayer(aPlayer, "Import");
		if (aCoverVariable == 1) GT_Utility.sendChatToPlayer(aPlayer, "Import (conditional)");
		if (aCoverVariable == 2) GT_Utility.sendChatToPlayer(aPlayer, "Import (invert cond)");
		if (aCoverVariable == 3) GT_Utility.sendChatToPlayer(aPlayer, "Keep Liquids Away");
		if (aCoverVariable == 4) GT_Utility.sendChatToPlayer(aPlayer, "Keep Liquids Away (conditional)");
		if (aCoverVariable == 5) GT_Utility.sendChatToPlayer(aPlayer, "Keep Liquids Away (invert cond)");
		return aCoverVariable;
	}
	
	@Override
	public boolean letsLiquidIn(byte aSide, int aCoverID, int aCoverVariable, ICoverable aTileEntity) {
		return !(aCoverVariable > 1 && aTileEntity instanceof IMachineProgress && (((IMachineProgress)aTileEntity).isAllowedToWork() != aCoverVariable < 2));
	}
	
	@Override
	public short getTickRate(byte aSide, int aCoverID, int aCoverVariable, ICoverable aTileEntity) {
		return aCoverVariable < 3 ? (short)50 : 1;
	}
}