package com.gildedrose

class LegendaryItem(name: String, sellIn: Int, quality: Int): Item(name, sellIn, quality) {
    override fun accept(itemQualityUpdater: ItemQualityUpdater) {
        itemQualityUpdater.update(this)
    }

}