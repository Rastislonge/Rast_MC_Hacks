package net.RastMod.hacks;

import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

public class HeadFlipper {
    private KeyBinding FLIP_HEAD_KEY = KeyBindingHelper.registerKeyBinding(new KeyBinding("key.rastmod.flip_head", InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_Z, "key.category.hacks"));

    public void tick(MinecraftClient client) {
            if (client.player != null) {
                if (FLIP_HEAD_KEY.wasPressed()) {
                    float yaw = client.player.getHeadYaw();
                    client.player.setHeadYaw(180 - yaw);
                }
            }
    }
}
