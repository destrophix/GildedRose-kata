package com.gildedrose

abstract class Item(var name: String, var sellIn: Int, var quality: Int) {
    override fun toString(): String {
        return this.name + ", " + this.sellIn + ", " + this.quality
    }

    abstract fun accept(itemQualityUpdater: ItemQualityUpdater)
}