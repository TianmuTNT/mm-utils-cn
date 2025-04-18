package org.astrarails.mmutilscn.utils.mm;

import net.minecraft.item.*;
import net.minecraft.init.*;
import net.minecraft.block.*;

public class KnifeSkins
{
    public static final Item[] knifeSkins;

    public static boolean isItemKnifeSkin(final Item itemIn) {
        if (itemIn == null) {
            return false;
        }
        for (int z = 0; z < KnifeSkins.knifeSkins.length; ++z) {
            if (KnifeSkins.knifeSkins[z] == itemIn) {
                return true;
            }
        }
        return false;
    }

    static {
        knifeSkins = new Item[] { 
        Items.iron_sword,
        Items.stone_sword, 
        Items.iron_shovel, 
        Items.stick, 
        Items.wooden_axe, 
        Items.wooden_sword, 
        Items.stone_shovel, 
        Items.blaze_rod,
        Items.diamond_shovel, 
        Items.quartz, 
        Items.pumpkin_pie, 
        Items.golden_pickaxe, 
        Items.name_tag, 
        Items.bone, 
        Items.carrot, 
        Items.golden_carrot, 
        Items.cookie, 
        Items.diamond_axe, 
        Items.prismarine_shard, 
        Items.cooked_beef, 
        Items.netherbrick, 
        Items.cooked_chicken, 
        Items.golden_sword, 
        Items.diamond_sword, 
        Items.diamond_hoe, 
        Items.shears, 
        Items.fish, 
        Items.dye, 
        Items.boat, 
        Items.speckled_melon, 
        Items.book, 
        Item.getItemFromBlock((Block)Blocks.double_plant), 
        Item.getItemFromBlock((Block)Blocks.deadbush),

        Items.reeds,
        Items.leather,
        Items.coal,
        Items.flint,
        Items.record_11,
        Items.record_13,
        Items.record_blocks,
        Items.record_cat,
        Items.record_chirp,
        Items.record_far,
        Items.record_mall,
        Items.record_mellohi,
        Items.record_stal,
        Items.record_strad,
        Items.record_wait,
        Items.record_ward,
        Items.bread,
        Items.golden_hoe,
        Item.getItemFromBlock((Block)Blocks.sapling),
        Items.golden_axe,
        Items.diamond_pickaxe,
        Items.golden_shovel,
        };
    }
}
