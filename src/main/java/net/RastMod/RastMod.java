package net.RastMod;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.MinecraftClient;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.api.ClientModInitializer;

public class RastMod implements ModInitializer, ClientModInitializer{
    private net.RastMod.hacks.BoatFly boatfly;
    private static RastMod instance;
    @Override
    public void onInitialize() {
        if (instance == null) instance = this;
        ClientTickEvents.END_CLIENT_TICK.register(this::tick);
        this.boatfly = new net.RastMod.hacks.BoatFly();
    }
    public void onInitializeClient() {
        if (instance == null) instance = this;
        ClientTickEvents.END_CLIENT_TICK.register(this::tick);
        this.boatfly = new net.RastMod.hacks.BoatFly();
    }
    public void tick(MinecraftClient client) {
        boatfly.tick(client);
    }
}
