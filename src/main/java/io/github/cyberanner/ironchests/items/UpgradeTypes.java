package io.github.cyberanner.ironchests.items;

import io.github.cyberanner.ironchests.blocks.ChestTypes;
import static io.github.cyberanner.ironchests.blocks.ChestTypes.*;

public enum UpgradeTypes {
    WOOD_TO_COPPER(WOOD, COPPER),
    COPPER_TO_IRON(COPPER, IRON),
    IRON_TO_GOLD(IRON, GOLD),
    GOLD_TO_DIAMOND(GOLD, DIAMOND),
    DIAMOND_TO_CRYSTAL(DIAMOND, CRYSTAL),
    DIAMOND_TO_OBSIDIAN(DIAMOND, OBSIDIAN);

    public final ChestTypes source;
    public final ChestTypes target;

    UpgradeTypes(ChestTypes source, ChestTypes target) {
        this.source = source;
        this.target = target;
    }

    public boolean canUpgrade(ChestTypes from) {
        return from == this.source;
    }
}
