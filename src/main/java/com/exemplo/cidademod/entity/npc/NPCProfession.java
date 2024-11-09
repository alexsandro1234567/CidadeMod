package com.exemplo.cidademod.entity.npc;

import com.exemplo.cidademod.trading.TradeOffer;
import net.minecraft.world.item.Items;
import java.util.Arrays;
import java.util.List;

public enum NPCProfession {
    COMERCIANTE(Arrays.asList(
        new TradeOffer(Items.EMERALD, 2, Items.BREAD, 1),
        new TradeOffer(Items.EMERALD, 5, Items.IRON_SWORD, 1)
    )),
    
    FAZENDEIRO(Arrays.asList(
        new TradeOffer(Items.WHEAT, 20, Items.EMERALD, 1)
    )),
    
    GUARDA(null); // Guardas não comerciam, apenas protegem

    private final List<TradeOffer> trades;
    
    NPCProfession(List<TradeOffer> trades) {
        this.trades = trades;
    }

    public List<TradeOffer> getTrades() {
        return trades;
    }
} 