package net.RastMod;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.MinecraftClient;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.api.ClientModInitializer;

public class RastMod implements ModInitializer, ClientModInitializer{
    private net.RastMod.hacks.BoatFly boatfly;
    private net.RastMod.hacks.AddedVelocity addedvelocity;
    private net.RastMod.hacks.HeadShakeNo headno ;
    private net.RastMod.hacks.HeadFlipper headflip ;
    private static RastMod instance;
    @Override
    public void onInitialize() {
        if (instance == null) instance = this;
        ClientTickEvents.END_CLIENT_TICK.register(this::tick);
        this.boatfly = new net.RastMod.hacks.BoatFly();
        this.addedvelocity = new net.RastMod.hacks.AddedVelocity();
        this.headno = new net.RastMod.hacks.HeadShakeNo();
        this.headflip = new net.RastMod.hacks.HeadFlipper();
    }
    public void onInitializeClient() {
        if (instance == null) instance = this;
        ClientTickEvents.END_CLIENT_TICK.register(this::tick);
        this.boatfly = new net.RastMod.hacks.BoatFly();
        this.addedvelocity = new net.RastMod.hacks.AddedVelocity();
        this.headno = new net.RastMod.hacks.HeadShakeNo();
        this.headflip = new net.RastMod.hacks.HeadFlipper();
    }
    public void tick(MinecraftClient client) {
        boatfly.tick(client);
        addedvelocity.tick(client);
        headno.tick(client);
        headflip.tick(client);
    }
}
