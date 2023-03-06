package gregtechmod.common.covers;

import gregtechmod.api.GregTech_API;
import gregtechmod.api.interfaces.ICoverable;
import net.minecraft.item.ItemStack;

public class GT_Cover_RedstoneReceiverExternal extends GT_Cover_RedstoneWirelessBase {
	
	public GT_Cover_RedstoneReceiverExternal(ItemStack aStack) {
		super(aStack);
	}
	
	@Override
	public int doCoverThings(byte aSide, byte aInputRedstone, int aCoverID, int aCoverVariable, ICoverable aTileEntity) {
		aTileEntity.setOutputRedstoneSignal(aSide, GregTech_API.sWirelessRedstone.get(aCoverVariable)==null?0:GregTech_API.sWirelessRedstone.get(aCoverVariable));
		return aCoverVariable;
	}
	
	@Override
	public boolean manipulatesSidedRedstoneOutput(byte aSide, int aCoverID, int aCoverVariable, ICoverable aTileEntity) {
		return true;
	}
	
	@Override
	public short getTickRate(byte aSide, int aCoverID, int aCoverVariable, ICoverable aTileEntity) {
		return 1;
	}
}