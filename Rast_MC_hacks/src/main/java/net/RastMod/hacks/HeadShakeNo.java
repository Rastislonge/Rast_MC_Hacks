package net.RastMod.hacks;

import org.lwjgl.glfw.GLFW;
import net.minecraft.client.MinecraftClient;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;

public class HeadShakeNo {
    private KeyBinding HEAD_SHAKE_KEY = KeyBindingHelper.registerKeyBinding(new KeyBinding("key.rastmod.head_no", InputUtil.Type.KEYSYM, GLFW.GLFW_KEY_N, "key.category.hacks"));

    public void tick(MinecraftClient client) {
        ClientTickEvents.END_CLIENT_TICK.register(player -> {
            if (client.player != null) {
                if (HEAD_SHAKE_KEY.isPressed()) {
                    float yaw = client.player.getYaw();
                    client.player.setYaw(180 - yaw);
                }
            }
        });
    }
}
