package gregtechmod.common.containers;

import gregtechmod.api.gui.GT_ContainerMetaTile_Machine;
import gregtechmod.api.interfaces.IGregTechTileEntity;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Slot;

public class GT_Container_2by2 extends GT_ContainerMetaTile_Machine {
	
	public GT_Container_2by2(InventoryPlayer aInventoryPlayer, IGregTechTileEntity aTileEntity, int aID) {
		super(aInventoryPlayer, aTileEntity, aID);
	}
	
	@Override
    public void addSlots(InventoryPlayer aInventoryPlayer) {
        addSlotToContainer(new Slot(mTileEntity, 0,  71,  26));
        addSlotToContainer(new Slot(mTileEntity, 1,  89,  26));
        addSlotToContainer(new Slot(mTileEntity, 2,  71,  44));
        addSlotToContainer(new Slot(mTileEntity, 3,  89,  44));
    }
	
	@Override
    public int getSlotCount() {
    	return 4;
    }
	
	@Override
    public int getShiftClickSlotCount() {
    	return 4;
    }
}
