package gregtechmod.common.tileentities;

import gregtechmod.api.interfaces.IGregTechTileEntity;
import gregtechmod.api.metatileentity.MetaTileEntity;
import gregtechmod.api.metatileentity.implementations.GT_MetaTileEntity_BasicMachine_Bronze;
import gregtechmod.api.util.GT_Recipe;
import gregtechmod.api.util.GT_Utility;
import net.minecraft.entity.player.EntityPlayer;

public class GT_MetaTileEntity_BronzeAlloySmelter extends GT_MetaTileEntity_BasicMachine_Bronze {
	
	public GT_MetaTileEntity_BronzeAlloySmelter(int aID, String mName, String mNameRegional) {
		super(aID, mName, mNameRegional);
	}
	
	public GT_MetaTileEntity_BronzeAlloySmelter() {
		
	}
	
	@Override
	public void onRightclick(EntityPlayer aPlayer) {
		getBaseMetaTileEntity().openGUI(aPlayer, 166);
	}
	
	@Override
	public MetaTileEntity newMetaEntity(IGregTechTileEntity aTileEntity) {
		return new GT_MetaTileEntity_BronzeAlloySmelter();
	}
	
	@Override
    public void checkRecipe() {
		GT_Utility.moveStackFromSlotAToSlotB(getBaseMetaTileEntity(), getBaseMetaTileEntity(), 3, 4, (byte)64, (byte)1, (byte)64, (byte)1);
    	if (mInventory[1] != null || mInventory[2] != null) {
    		GT_Recipe tRecipe = GT_Recipe.findEqualAlloySmelterRecipe(mInventory[1], mInventory[2]);
    		if (tRecipe != null && spaceForOutput(tRecipe.mOutput1, null) && tRecipe.isRecipeInputEqual(true, true, mInventory[1], mInventory[2])) {
        		mEUt = tRecipe.mEUt;
    			mMaxProgresstime = tRecipe.mDuration * 2;
    			mOutputItem1 = GT_Utility.copy(tRecipe.mOutput1);
    			return;
    		}
    	}
		mOutputItem1 = null;
    }
	
	@Override
    public boolean hasTwoSeperateInputs() {
    	return true;
    }
	
	@Override
	public int getFrontFacingInactive() {
		return 332;
	}
	
	@Override
	public int getFrontFacingActive() {
		return 333;
	}
	
	@Override
	public int getSideFacingInactive() {
		return 334;
	}
	
	@Override
	public int getBottomFacingInactive() {
		return 335;
	}
	
	@Override
	public String getDescription() {
		return "Steam powered combination Smelter";
	}
}
