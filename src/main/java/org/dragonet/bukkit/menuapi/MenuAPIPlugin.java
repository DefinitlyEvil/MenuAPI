package org.dragonet.bukkit.menuapi;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created on 2017/9/20.
 */
public class MenuAPIPlugin extends JavaPlugin {

    private static MenuAPIPlugin instance;

    private ItemMenu menus;

    @Override
    public void onEnable() {
        menus = new ItemMenu();
        getServer().getPluginManager().registerEvents(menus, this);
    }

    public ItemMenu getMenus() {
        return menus;
    }

    public static MenuAPIPlugin getInstance() {
        return instance;
    }

    public static ItemMenu getMenuAPI() {
        return instance.menus;
    }
}
