package net.RastMod.hacks;

import net.minecraft.client.MinecraftClient;

public class Flying {
    public void tick(MinecraftClient client){
        if (client.player != null) {
        client.player.getAbilities().allowFlying = true ;
        }
    }
}
