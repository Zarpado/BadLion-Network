package net.badlion.arenacommon.rulesets;

import net.badlion.arenacommon.ArenaCommon;
import net.badlion.arenacommon.util.ItemStackUtil;
import net.badlion.smellyinventory.SmellyInventory;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

public class HCFRuleSet extends KitRuleSet {

    public HCFRuleSet(int id, String name) {
        super(id, name, new ItemStack(Material.ENDER_PEARL), ArenaCommon.ArenaType.PEARL, KnockbackType.SPEED_II, true, false);

	    // Initialize valid enchants
	    this.validEnchantments.put(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
	    this.validEnchantments.put(Enchantment.PROTECTION_FALL, 4);
	    this.validEnchantments.put(Enchantment.DAMAGE_ALL, 3);
	    this.validEnchantments.put(Enchantment.DURABILITY, 3);
	    this.validEnchantments.put(Enchantment.ARROW_DAMAGE, 3);
	    this.validEnchantments.put(Enchantment.ARROW_FIRE, 1);
	    this.validEnchantments.put(Enchantment.ARROW_INFINITE, 1);

        // Create default armor kit
        this.defaultArmorKit[3] = new ItemStack(Material.DIAMOND_HELMET);
        this.defaultArmorKit[3].addEnchantment(Enchantment.DURABILITY, 3);
        this.defaultArmorKit[3].addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);

        this.defaultArmorKit[2] = new ItemStack(Material.DIAMOND_CHESTPLATE);
        this.defaultArmorKit[2].addEnchantment(Enchantment.DURABILITY, 3);
        this.defaultArmorKit[2].addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);

        this.defaultArmorKit[1] = new ItemStack(Material.DIAMOND_LEGGINGS);
        this.defaultArmorKit[1].addEnchantment(Enchantment.DURABILITY, 3);
        this.defaultArmorKit[1].addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);

        this.defaultArmorKit[0] = new ItemStack(Material.DIAMOND_BOOTS);
        this.defaultArmorKit[0].addEnchantment(Enchantment.DURABILITY, 3);
        this.defaultArmorKit[0].addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
        this.defaultArmorKit[0].addEnchantment(Enchantment.PROTECTION_FALL, 4);

        // Create default inventory kit
        this.defaultInventoryKit[0] = new ItemStack(Material.DIAMOND_SWORD);
        this.defaultInventoryKit[0].addEnchantment(Enchantment.DURABILITY, 3);
        this.defaultInventoryKit[0].addEnchantment(Enchantment.DAMAGE_ALL, 3);

        this.defaultInventoryKit[1] = new ItemStack(Material.BOW);
        this.defaultInventoryKit[1].addEnchantment(Enchantment.ARROW_INFINITE, 1);
        this.defaultInventoryKit[1].addEnchantment(Enchantment.ARROW_FIRE, 1);
        this.defaultInventoryKit[1].addEnchantment(Enchantment.ARROW_DAMAGE, 3);

        this.defaultInventoryKit[2] = new ItemStack(Material.ENDER_PEARL, 16);
        this.defaultInventoryKit[3] = new ItemStack(Material.COOKED_BEEF, 64);
        this.defaultInventoryKit[4] = ItemStackUtil.HEALING_SPLASH_II;
        this.defaultInventoryKit[5] = ItemStackUtil.HEALING_SPLASH_II;
        this.defaultInventoryKit[6] = ItemStackUtil.HEALING_SPLASH_II;
        this.defaultInventoryKit[7] = ItemStackUtil.FIRE_RESISTANCE_POTION_EXT;
        this.defaultInventoryKit[8] = ItemStackUtil.SWIFTNESS_POTION_II;

        this.defaultInventoryKit[9] = new ItemStack(Material.ARROW, 64);
        this.defaultInventoryKit[10] = ItemStackUtil.HEALING_SPLASH_II;
        this.defaultInventoryKit[11] = ItemStackUtil.HEALING_SPLASH_II;
        this.defaultInventoryKit[12] = ItemStackUtil.HEALING_SPLASH_II;
        this.defaultInventoryKit[13] = ItemStackUtil.HEALING_SPLASH_II;
        this.defaultInventoryKit[14] = ItemStackUtil.HEALING_SPLASH_II;
        this.defaultInventoryKit[15] = ItemStackUtil.HEALING_SPLASH_II;
        this.defaultInventoryKit[16] = ItemStackUtil.SLOWNESS_SPLASH;
        this.defaultInventoryKit[17] = ItemStackUtil.POISON_SPLASH;

        this.defaultInventoryKit[18] = ItemStackUtil.HEALING_SPLASH_II;
        this.defaultInventoryKit[19] = ItemStackUtil.HEALING_SPLASH_II;
        this.defaultInventoryKit[20] = ItemStackUtil.HEALING_SPLASH_II;
        this.defaultInventoryKit[21] = ItemStackUtil.HEALING_SPLASH_II;
        this.defaultInventoryKit[22] = ItemStackUtil.HEALING_SPLASH_II;
        this.defaultInventoryKit[23] = ItemStackUtil.HEALING_SPLASH_II;
        this.defaultInventoryKit[24] = ItemStackUtil.HEALING_SPLASH_II;
        this.defaultInventoryKit[25] = ItemStackUtil.SLOWNESS_SPLASH;
        this.defaultInventoryKit[26] = ItemStackUtil.POISON_SPLASH;

        this.defaultInventoryKit[27] = ItemStackUtil.HEALING_SPLASH_II;
        this.defaultInventoryKit[28] = ItemStackUtil.HEALING_SPLASH_II;
        this.defaultInventoryKit[29] = ItemStackUtil.HEALING_SPLASH_II;
        this.defaultInventoryKit[30] = ItemStackUtil.HEALING_SPLASH_II;
        this.defaultInventoryKit[31] = ItemStackUtil.HEALING_SPLASH_II;
        this.defaultInventoryKit[32] = ItemStackUtil.HEALING_SPLASH_II;
        this.defaultInventoryKit[33] = ItemStackUtil.SWIFTNESS_POTION_II;
        this.defaultInventoryKit[34] = ItemStackUtil.SWIFTNESS_POTION_II;
        this.defaultInventoryKit[35] = ItemStackUtil.SWIFTNESS_POTION_II;

        // Set up kit creation chest
        this.kitCreationInventory.setItem(0, ItemStackUtil.DIAMOND_HELMET);
        this.kitCreationInventory.setItem(9, ItemStackUtil.DIAMOND_CHESTPLATE);
        this.kitCreationInventory.setItem(18, ItemStackUtil.DIAMOND_LEGGINGS);
        this.kitCreationInventory.setItem(27, ItemStackUtil.DIAMOND_BOOTS);
        this.kitCreationInventory.setItem(36, ItemStackUtil.DIAMOND_SWORD);
        this.kitCreationInventory.setItem(45, ItemStackUtil.DIAMOND_AXE);

        this.kitCreationInventory.setItem(1, ItemStackUtil.BOW);
        this.kitCreationInventory.setItem(10, ItemStackUtil.ARROW);
        this.kitCreationInventory.setItem(19, ItemStackUtil.FISHING_ROD);
        this.kitCreationInventory.setItem(37, ItemStackUtil.APPLE);
        this.kitCreationInventory.setItem(46, ItemStackUtil.BAKED_POTATO);

        this.kitCreationInventory.setItem(2, ItemStackUtil.ENDER_PEARL);
        this.kitCreationInventory.setItem(11, ItemStackUtil.MILK_BUCKET);
        this.kitCreationInventory.setItem(38, ItemStackUtil.COOKED_BEEF);
        this.kitCreationInventory.setItem(47, ItemStackUtil.COOKED_CHICKEN);

        this.kitCreationInventory.setItem(3, ItemStackUtil.HEALING_POTION_II);
        this.kitCreationInventory.setItem(12, ItemStackUtil.HEALING_SPLASH_II);
        this.kitCreationInventory.setItem(39, ItemStackUtil.COOKIE);
        this.kitCreationInventory.setItem(48, ItemStackUtil.COOKED_FISH);

        this.kitCreationInventory.setItem(4, ItemStackUtil.SWIFTNESS_POTION_EXT);
        this.kitCreationInventory.setItem(13, ItemStackUtil.SWIFTNESS_POTION_II);
        this.kitCreationInventory.setItem(40, ItemStackUtil.MELON);
        this.kitCreationInventory.setItem(49, ItemStackUtil.PUMPKIN_PIE);

        this.kitCreationInventory.setItem(5, ItemStackUtil.SWIFTNESS_SPLASH_EXT);
        this.kitCreationInventory.setItem(14, ItemStackUtil.SWIFTNESS_SPLASH_II);
        this.kitCreationInventory.setItem(41, ItemStackUtil.GRILLED_PORK);
        this.kitCreationInventory.setItem(50, ItemStackUtil.BREAD);

        this.kitCreationInventory.setItem(6, ItemStackUtil.FIRE_RESISTANCE_POTION_EXT);
        this.kitCreationInventory.setItem(15, ItemStackUtil.FIRE_RESISTANCE_SPLASH_EXT);

        this.kitCreationInventory.setItem(7, ItemStackUtil.SLOWNESS_SPLASH);

        this.kitCreationInventory.setItem(8, ItemStackUtil.POISON_SPLASH);
        this.kitCreationInventory.setItem(53, SmellyInventory.getCloseInventoryItem());

        // Initialize info signs
	    this.info2Sign[0] = "================";
	    this.info2Sign[1] = "§5HCFactions";
	    this.info2Sign[2] = "";
	    this.info2Sign[3] = "================";

	    this.info4Sign[0] = "§dDiamond Armor";
	    this.info4Sign[1] = "Protection II";
	    this.info4Sign[2] = "Unbreaking III";
	    this.info4Sign[3] = "FF IV";

	    this.info5Sign[0] = "§dDiamond Sword";
	    this.info5Sign[1] = "Sharpness III";
	    this.info5Sign[2] = "Fire Aspect I";
	    this.info5Sign[3] = "";

	    this.info6Sign[0] = "§dBow";
	    this.info6Sign[1] = "Power III";
	    this.info6Sign[2] = "Flame/Infinity";
	    this.info6Sign[3] = "";

	    this.info7Sign[0] = "§dPotions(Buff)";
	    this.info7Sign[1] = "Health II";
	    this.info7Sign[2] = "Speed I / II";
	    this.info7Sign[3] = "Fire Res";

	    this.info8Sign[0] = "§d(Debuffs)";
	    this.info8Sign[1] = "Poison 0:33";
	    this.info8Sign[2] = "Slowness 1:07";
	    this.info8Sign[3] = "";

	    this.info9Sign[0] = "§dAllowed Items";
	    this.info9Sign[1] = "All Food";
	    this.info9Sign[2] = "Pearls";
	    this.info9Sign[3] = "No Gapples";
    }

}
