package gregtechmod.api.util;

import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.Property;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class GT_LanguageManager {
	public static volatile int VERSION = 404;
	
	/** Yeah! I got a File for Slang! */
    public static Configuration sLangFile;
	
	public static String[] mNameList0		= {"Adv_Machine", "Fusioncoil", "Iridium_reinforced_Stone", "Block_of_Silver", "Block_of_Ruby", "Block_of_Sapphire", "LESU_Block", "Block_of_Aluminium", "Block_of_Titanium", "Block_of_Chrome", "Highly_Advanced_Machineblock", "Block_of_Steel", "Block_of_Brass", "Standard_Machine_Casing", "Reinforced_Machine_Casing", "Advanced_Machine_Casing"};
    public static String[] mNameList1		= {"GT_BUG", "Fusionreactor", "Lightningrod", "Quantumchest", "GregTech_Computercube", "UUM_Assembler", "Sonictron", "Lapotronic_Energystorageunit", "Interdimensional_Energystorageunit", "Adjustable_Energystorageunit", "Charge_O_Mat", "Industrial_Centrifuge", "Superconductorwire", "Playerdetector", "Matterfabricator", "Supercondensator"};
    public static String[] mNameList2		= {"GT_Ore", "Galena_Ore", "Iridium_Ore", "Ruby_Ore", "Sapphire_Ore", "Bauxite_Ore", "Pyrite_Ore", "Cinnabar_Ore", "Sphalerite_Ore", "Tungstate_Ore", "Cooperite_Ore", "Olivine_Ore", "Sodalite_Ore", "Tetrahedrite_Ore", "Cassiterite_Ore", "Nickel_Ore"};
    public static String[] mNameList3		= {"GT_LeadBlock", "GT_ElectrumBlock", "GT_ZincBlock", "GT_OlivineBlock", "GT_GreenSapphireBlock", "GT_PlatinumBlock", "GT_TungstenBlock", "GT_NickelBlock", "GT_TungstenSteelWall", "GT_TungstenSteelIridiumWall", "GT_InvarBlock", "GT_OsmiumBlock", "GT_IridiumBlock", "GT_Bronze_Plated_Bricks", "GT_YellowGarnetBlock", "GT_RedGarnetBlock"};
    public static String[] mNameList4		= {"GT_Black_Granite", "GT_Black_Granite_Cobble", "GT_Black_Granite_Cobble_Mossy", "GT_Black_Granite_Bricks", "GT_Black_Granite_Bricks_Cracked", "GT_Black_Granite_Bricks_Mossy", "GT_Black_Granite_Bricks_Chiseled", "GT_Black_Granite_Smooth", "GT_Red_Granite", "GT_Red_Granite_Cobble", "GT_Red_Granite_Cobble_Mossy", "GT_Red_Granite_Bricks", "GT_Red_Granite_Bricks_Cracked", "GT_Red_Granite_Bricks_Mossy", "GT_Red_Granite_Bricks_Chiseled", "GT_Red_Granite_Smooth"};
	public static String[] mNameListItem	= {"GT_MetaItem_00", "GT_MetaItem_01", "GT_MetaItem_02", "GT_MetaItem_03", "GT_MetaItem_04", "GT_MetaItem_05", "GT_MetaItem_06", "GT_MetaItem_07", "GT_MetaItem_08", "GT_MetaItem_09", "GT_MetaItem_10", "GT_MetaItem_11", "GT_MetaItem_12", "GT_MetaItem_13", "GT_MetaItem_14", "GT_MetaItem_15", "GregTech_Sensorcard", "GregTech_Sensorkit", "Ultimate_Cheat_Armor", "", "", "", "", "", "", "", "", "", "", "", "Iron_Mortar", "Flint_Mortar", "Sonictron", "Destructopack", "60k_Helium_Coolantcell", "180k_Helium_Coolantcell", "360k_Helium_Coolantcell", "Lapotronic_Energyorb", "Cloaking_Device", "Bronze_Jack_Hammer", "Iridium_Neutronreflector", "Steel_Jack_Hammer", "Diamond_Jack_Hammer", "Dataorb", "Lighthelmet", "Lapotronpack", "Rockcutter", "Teslastaff", "Thoriumcell", "Double_Thoriumcell", "Quad_Thoriumcell", "Plutoniumcell", "Double_Plutoniumcell", "Quad_Plutoniumcell", "Lithium_Reactor_Cell", "Debug_Scanner", "Lithium_Battery_Empty", "Lithium_Battery", "Lithium_Batpack", "Personal_Force_Field_Generator", "60k_NaK_Coolantcell", "180k_NaK_Coolantcell", "360k_NaK_Coolantcell", "GT_Scanner", "GT_Crowbar", "GT_Screwdriver", "GT_Wrench_Steel", "GT_Wrench_Iron", "GT_Wrench_TungstenSteel", "GT_Wrench_Bronze", "GT_Wrench_Electric", "GT_Wrench_Advanced", "GT_Hammer_Rubber", "GT_Hammer_Iron", "GT_Hammer_Bronze", "GT_Hammer_Steel", "GT_Hammer_Tungstensteel", "GT_SolderingTool", "GT_SolderingTin", "GT_SolderingLead", "GT_Turbine_Bronze", "GT_Turbine_Steel", "GT_Turbine_Magnalium", "GT_Turbine_Tungstensteel", "GT_Turbine_Carbon", "GT_Lava_Filter", "GT_File_Iron", "GT_File_Bronze", "GT_File_Steel", "GT_File_Tungstensteel", "GT_Spray_Bug", "GT_Spray_Ice", "GT_Spray_Hardener", "GT_Spray_Foam", "GT_Spray_Pepper", "GT_Spray_Hydration", "GT_Spray_00", "GT_Spray_01", "GT_Spray_02", "GT_Spray_03", "GT_Spray_04", "GT_Spray_05", "GT_Spray_06", "GT_Spray_07", "GT_Spray_08", "GT_Spray_09", "GT_Spray_10", "GT_Spray_11", "GT_Spray_12", "GT_Spray_13", "GT_Spray_14", "GT_Spray_15", "Empty_Electric_Wrench", "Empty_Advanced_Wrench", "Empty_Soldering_Tool", "GT_Saw_Iron", "GT_Saw_Bronze", "GT_Saw_Steel", "GT_Saw_Tungstensteel", "GT_Saw_Electric", "GT_Saw_Advanced", "Empty_Electric_Saw", "Empty_Advanced_Saw", "GT_Drill_Advanced", "GT_Flint_Sword", "GT_Flint_Pickaxe", "GT_Flint_Shovel", "GT_Flint_Axe", "GT_Flint_Hoe", "GT_Steel_Sword", "GT_Steel_Pickaxe", "GT_Steel_Shovel", "GT_Steel_Axe", "GT_Steel_Hoe", "GT_TungstenSteel_Sword", "GT_TungstenSteel_Pickaxe", "GT_TungstenSteel_Shovel", "GT_TungstenSteel_Axe", "GT_TungstenSteel_Hoe"};
	
    public static String[] mRegionalNameList0		= {"Advanced Machine Block", "Fusion Coil", "Iridium Reinforced Stone", "Block of Silver", "Block of Ruby", "Block of Sapphire", "LESU-Block", "Block of Aluminium", "Block of Titanium", "Block of Chrome", "Highly Advanced Machineblock", "Block of Steel", "Block of Brass", "Standard Machine Casing", "Reinforced Machine Casing", "Advanced Machine Casing"};
    public static String[] mRegionalNameList1		= {"You ran into a serious Bug, if you have legitly aquired this Block, please report it immidietly", "Fusion Reactor", "Lightning Rod", "Old Quantum Chest", "GregTech Computer Cube", "UUM-Assembler", "Sonictron", "Lapotronic Energy Storage Unit", "Interdimensional Energy Storage Unit", "Adjustable Energy Storage Unit", "Charge-O-Mat", "Industrial Centrifuge", "Superconductor Wire", "Player Detector", "Matter Fabricator", "Supercondensator"};
    public static String[] mRegionalNameList2		= {"GT_Ore", "Galena Ore", "Iridium Ore", "Ruby Ore", "Sapphire Ore", "Bauxite Ore", "Pyrite Ore", "Cinnabar Ore", "Sphalerite Ore", "Tungstate Ore", "Sheldonite Ore", "Olivine Ore", "Sodalite Ore", "Tetrahedrite Ore", "Cassiterite Ore", "Nickel Ore"};
    public static String[] mRegionalNameList3		= {"Block of Lead", "Block of Electrum", "Block of Zinc", "Block of Olivine", "Block of Green Sapphire", "Block of Platinum", "Block of Tungsten", "Block of Nickel", "Tungstensteel Block", "Iridium Reinforced Tungstensteel Block", "Block of Invar", "Block of Osmium", "Block of Iridium", "Bronze Plated Bricks", "Block of Yellow Garnet", "Block of Red Garnet"};
    public static String[] mRegionalNameList4		= {"Black Granite", "Black Granite Cobblestone", "Mossy Black Granite Cobblestone", "Black Granite Bricks", "Cracked Black Granite Bricks", "Mossy Black Granite Bricks", "Chiseled Black Granite", "Smooth Black Granite", "Red Granite", "Red Granite Cobblestone", "Mossy Red Granite Cobblestone", "Red Granite Bricks", "Cracked Red Granite Bricks", "Mossy Red Granite Bricks", "Chiseled Red Granite", "Smooth Red Granite"};
	public static String[] mRegionalNameListItem	= {"GT_MetaItem_00", "GT_MetaItem_01", "GT_MetaItem_02", "GT_MetaItem_03", "GT_MetaItem_04", "GT_MetaItem_05", "GT_MetaItem_06", "GT_MetaItem_07", "GT_MetaItem_08", "GT_MetaItem_09", "GT_MetaItem_10", "GT_MetaItem_11", "GT_MetaItem_12", "GT_MetaItem_13", "GT_MetaItem_14", "GT_MetaItem_15", "GregTech Sensor Card", "GregTech Sensor Kit", "Ultimate Cheat Armor", "", "", "", "", "", "", "", "", "", "", "", "Iron Mortar", "Flint Mortar", "Sonictron", "Destructopack", "60k Helium Coolant Cell", "180k Helium Coolant Cell", "360k Helium Coolant Cell", "Lapotronic Energy Orb", "Cloaking Device", "Bronze Jack Hammer", "Iridium Neutron Reflector", "Steel Jack Hammer", "Diamond Jack Hammer", "Data Orb", "Light Helmet", "Lapotron Pack", "Rock Cutter", "Tesla Staff", "Thorium Cell", "Double Thorium Cell", "Quad Thorium Cell", "Plutonium Cell", "Double Plutonium Cell", "Quad Plutonium Cell", "Lithium Reactor Cell", "Debug Scanner", "Lithium-Battery", "Lithium-Battery", "Lithium-Batpack", "Personal Force Field Generator", "60k NaK Coolantcell", "180k NaK Coolantcell", "360k NaK Coolantcell", "Portable Scanner", "Crowbar", "Screwdriver", "Steel Wrench", "Iron Wrench", "Tungstensteel Wrench", "Bronze Wrench", "Electric Wrench", "Advanced Wrench", "Rubber Hammer", "Iron Hammer", "Bronze Hammer", "Steel Hammer", "Tungstensteel Hammer", "Electric Soldering Iron", "Soldering Tin", "Soldering Lead", "Bronze Turbine Rotor", "Steel Turbine Rotor", "Magnalium Turbine Rotor", "Tungstensteel Turbine Rotor", "Carbon Turbine Rotor", "Lava Filter", "Iron File", "Bronze File", "Steel File", "Tungstensteel File", "Bug Spray", "Freezing Spray", "Hardening Spray", "Construction Spray", "Pepper Spray", "Hydration Spray", "Spray Can (Black)", "Spray Can (Red)", "Spray Can (Green)", "Spray Can (Brown)", "Spray Can (Blue)", "Spray Can (Purple)", "Spray Can (Cyan)", "Spray Can (Light Gray)", "Spray Can (Gray)", "Spray Can (Pink)", "Spray Can (Lime)", "Spray Can (Yellow)", "Spray Can (Light Blue)", "Spray Can (Magenta)", "Spray Can (Orange)", "Spray Can (White)", "Empty Electric Wrench", "Empty Advanced Wrench", "Empty Soldering Iron", "Iron Saw", "Bronze Saw", "Steel Saw", "Tungstensteel Saw", "Electric Saw", "Advanced Saw", "Empty Electric Saw", "Empty Advanced Saw", "Advanced Drill", "Flint Sword", "Flint Pickaxe", "Flint Shovel", "Flint Axe", "Flint Hoe", "Steel Sword", "Steel Pickaxe", "Steel Shovel", "Steel Axe", "Steel Hoe", "Tungstensteel Sword", "Tungstensteel Pickaxe", "Tungstensteel Shovel", "Tungstensteel Axe", "Tungstensteel Hoe"};
    
	public static String addStringLocalization(String aKey, String aValue) {
		Property tProperty = sLangFile.get("LanguageFile", aKey, aValue);
		if (sLangFile.get("EnableLangFile", "UseThisFileAsLanguageFile", false).getBoolean(false)) aValue = tProperty.getString();
		if (!tProperty.wasRead()) sLangFile.save();
		LanguageRegistry.instance().addStringLocalization(aKey, aValue);
		return aValue;
	}
}