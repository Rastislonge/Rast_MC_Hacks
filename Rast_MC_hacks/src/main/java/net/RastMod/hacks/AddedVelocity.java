package net.RastMod.hacks;

import net.minecraft.client.MinecraftClient;
import net.minecraft.util.math.Vec3d;

public class AddedVelocity {
    public void tick(MinecraftClient client){
        if (client.player != null) {
            double boost = client.player.getJumpBoostVelocityModifier();
            Vec3d boostVec = new Vec3d(0, boost, 0);
            Vec3d vec3d = client.player.getVelocity().add(boostVec);

            if (client.player.isSprinting() && client.options.jumpKey.isPressed()) {
                client.player.addVelocity(vec3d.x, boost, vec3d.z);
            }
        }
    }
}
