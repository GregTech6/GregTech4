package gregtechmod.common.gui;

import gregtechmod.api.GregTech_API;
import gregtechmod.api.gui.GT_GUIContainerMetaTile_Machine;
import gregtechmod.api.interfaces.IGregTechTileEntity;
import gregtechmod.common.containers.GT_Container_Teleporter;
import net.minecraft.entity.player.InventoryPlayer;

public class GT_GUIContainer_Teleporter extends GT_GUIContainerMetaTile_Machine {
	
    public GT_GUIContainer_Teleporter(InventoryPlayer aInventoryPlayer, IGregTechTileEntity aTileEntity, int aID) {
        super(new GT_Container_Teleporter(aInventoryPlayer, aTileEntity, aID), aTileEntity, aID, GregTech_API.GUI_PATH + "Teleporter.png");
    }
    
    @Override
    protected void drawGuiContainerForegroundLayer(int par1, int par2) {
    	fontRenderer.drawString("Teleporter", 46, 8, 16448255);
        if (mContainer != null) {
        	fontRenderer.drawString("X: "   + toNumber(((GT_Container_Teleporter)mContainer).mTargetX), 46, 16, 16448255);
        	fontRenderer.drawString("Y: "   + toNumber(((GT_Container_Teleporter)mContainer).mTargetY), 46, 24, 16448255);
        	fontRenderer.drawString("Z: "   + toNumber(((GT_Container_Teleporter)mContainer).mTargetZ), 46, 32, 16448255);
        	if (((GT_Container_Teleporter)mContainer).mEgg>0)
        	fontRenderer.drawString("Dim: " + toNumber(((GT_Container_Teleporter)mContainer).mTargetD), 46, 40, 16448255);
        }
    }
    
    @Override
    protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3) {
    	super.drawGuiContainerBackgroundLayer(par1, par2, par3);
        int x = (width - xSize) / 2;
        int y = (height - ySize) / 2;
        drawTexturedModalRect(x, y, 0, 0, xSize, ySize);
    }
}
