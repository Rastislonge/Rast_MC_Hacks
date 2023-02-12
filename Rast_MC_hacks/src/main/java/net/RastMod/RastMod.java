package net.RastMod;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.MinecraftClient;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.api.ClientModInitializer;

public class RastMod implements ModInitializer, ClientModInitializer{
    private net.RastMod.hacks.BoatFly boatFly;
    private net.RastMod.hacks.AddedVelocity addedvelocity;
    private net.RastMod.hacks.HeadShakeNo headNo ;
    private net.RastMod.hacks.HeadFlipper headFlipper ;
    private net.RastMod.hacks.Flying flying ;
    private net.RastMod.hacks.AutoFarming autoFarming ;
    private static RastMod instance;
    @Override
    public void onInitialize() {
        if (instance == null) instance = this;
        ClientTickEvents.END_CLIENT_TICK.register(this::tick);
        this.boatFly = new net.RastMod.hacks.BoatFly();
        this.addedvelocity = new net.RastMod.hacks.AddedVelocity();
        this.headNo = new net.RastMod.hacks.HeadShakeNo();
        this.headFlipper = new net.RastMod.hacks.HeadFlipper();
        //this.flying = new net.RastMod.hacks.Flying();
        this.autoFarming = new net.RastMod.hacks.AutoFarming();
    }
    public void onInitializeClient() {
        if (instance == null) instance = this;
        ClientTickEvents.END_CLIENT_TICK.register(this::tick);
        this.boatFly = new net.RastMod.hacks.BoatFly();
        this.addedvelocity = new net.RastMod.hacks.AddedVelocity();
        this.headNo = new net.RastMod.hacks.HeadShakeNo();
        this.headFlipper = new net.RastMod.hacks.HeadFlipper();
        //this.flying = new net.RastMod.hacks.Flying();
        this.autoFarming = new net.RastMod.hacks.AutoFarming();
    }
    public void tick(MinecraftClient client) {
        boatFly.tick(client);
        addedvelocity.tick(client);
        headNo.tick(client);
        headFlipper.tick(client);
        //flying.tick(client);
        autoFarming.tick(client);
    }
}
