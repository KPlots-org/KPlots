package org.kplots.bukkit

import org.bukkit.plugin.java.JavaPlugin

class KPlots : JavaPlugin() {

    override fun onLoad() {
        println("KPlots loading...")
    }
    override fun onEnable() {
        println("KPlots enabled.")
    }
    override fun onDisable() {
        println("KPlots disabled.")
    }
}