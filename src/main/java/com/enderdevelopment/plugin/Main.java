package com.enderdevelopment.plugin;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.enchantment.EnchantItemEvent;
import org.bukkit.event.inventory.PrepareAnvilEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.Material;
import org.bukkit.Registry;

public final class Main extends JavaPlugin implements Listener {

    private NamespacedKey infinityKey;

    @Override
    public void onEnable() {
        // Initialize the NamespacedKey for the infinity enchantment
        infinityKey = new NamespacedKey(this, "infinity_totem");
        
        // Register events
        getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @EventHandler
    public void onEnchant(EnchantItemEvent event) {
        ItemStack item = event.getItem();
        if (item.getType() == Material.TOTEM_OF_UNDYING) {
            // Check if the player has permission to enchant totems with infinity
            if (event.getEnchanter().hasPermission("toteminfinity.enchant")) {
                // Add infinity enchantment to the totem
                ItemMeta meta = item.getItemMeta();
                if (meta != null) {
                    Enchantment infinity = Registry.ENCHANTMENT.get(NamespacedKey.minecraft("infinity"));
                    if (infinity != null) {
                        meta.addEnchant(infinity, 1, true);
                        item.setItemMeta(meta);
                    }
                }
            }
        }
    }

    @EventHandler
    public void onAnvilUse(PrepareAnvilEvent event) {
        ItemStack result = event.getResult();
        if (result != null && result.getType() == Material.TOTEM_OF_UNDYING) {
            // Check if the player has permission to enchant totems with infinity
            if (event.getView().getPlayer().hasPermission("toteminfinity.anvil")) {
                // Add infinity enchantment to the totem
                ItemMeta meta = result.getItemMeta();
                if (meta != null) {
                    Enchantment infinity = Registry.ENCHANTMENT.get(NamespacedKey.minecraft("infinity"));
                    if (infinity != null) {
                        meta.addEnchant(infinity, 1, true);
                        result.setItemMeta(meta);
                        event.setResult(result);
                    }
                }
            }
        }
    }
}