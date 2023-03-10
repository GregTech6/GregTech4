package gregtechmod.common.tileentities;

import gregtechmod.api.interfaces.IGregTechTileEntity;
import gregtechmod.api.metatileentity.MetaTileEntity;
import gregtechmod.api.metatileentity.implementations.GT_MetaTileEntity_BasicMachine;
import gregtechmod.api.util.GT_ModHandler;
import gregtechmod.api.util.GT_Utility;
import net.minecraft.entity.player.EntityPlayer;

public class GT_MetaTileEntity_Extractor extends GT_MetaTileEntity_BasicMachine {
	
	public GT_MetaTileEntity_Extractor(int aID, String mName, String mNameRegional) {
		super(aID, mName, mNameRegional);
	}
	
	public GT_MetaTileEntity_Extractor() {
		
	}
	
	@Override public void onRightclick(EntityPlayer aPlayer)		{getBaseMetaTileEntity().openGUI(aPlayer, 132);}
	
	@Override
	public MetaTileEntity newMetaEntity(IGregTechTileEntity aTileEntity) {
		return new GT_MetaTileEntity_Extractor();
	}
	
	@Override
    public void checkRecipe() {
		GT_Utility.moveStackFromSlotAToSlotB(getBaseMetaTileEntity(), getBaseMetaTileEntity(), 1, 2, (byte)64, (byte)1, (byte)64, (byte)1);
		GT_Utility.moveStackFromSlotAToSlotB(getBaseMetaTileEntity(), getBaseMetaTileEntity(), 3, 4, (byte)64, (byte)1, (byte)64, (byte)1);
    	if (mInventory[2] != null && null != (mOutputItem1 = GT_ModHandler.getExtractorOutput(mInventory[2], true, mInventory[3]))) {
    		mEUt = 2;
    		mMaxProgresstime = 400;
    	}
    }
	
	@Override
	public int getSideFacingInactive() {
		return 242;
	}
	
	@Override
	public int getSideFacingActive() {
		return 227;
	}
	
	@Override
	public int getFrontFacingInactive() {
		return 246;
	}
	
	@Override
	public int getFrontFacingActive() {
		return 247;
	}
	
	@Override
	public int getTopFacingInactive() {
		return 230;
	}
	
	@Override
	public int getTopFacingActive() {
		return 231;
	}
	
	@Override
	public String getDescription() {
		return "Dejuicer-Device of Doom - D123";
	}
}
