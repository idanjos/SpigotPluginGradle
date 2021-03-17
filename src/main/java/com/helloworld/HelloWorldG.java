package com.helloworld;



import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class HelloWorldG extends JavaPlugin {
    @Override
    public void onEnable(){


        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[HelloWorld] HelloWorld enabled!");
    }

    @Override
    public void onDisable(){getServer().getConsoleSender().sendMessage(ChatColor.RED + "[HelloWorld] HelloWorld disabled!"); }

    public static void main(String[] args) {

    }
}
