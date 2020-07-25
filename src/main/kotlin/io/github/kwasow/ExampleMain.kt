package io.github.kwasow

import org.bukkit.plugin.java.JavaPlugin

class ExampleMain : JavaPlugin() {
    override fun onEnable() {
        super.onEnable()

        println("Plugin ExampleMain enabled")
    }

    override fun onDisable() {
        super.onDisable()

        println("Plugin ExampleMain disabled")
    }
}
