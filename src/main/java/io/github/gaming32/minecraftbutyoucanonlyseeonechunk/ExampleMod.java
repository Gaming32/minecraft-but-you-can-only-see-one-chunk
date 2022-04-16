package io.github.gaming32.minecraftbutyoucanonlyseeonechunk;

import net.fabricmc.api.ModInitializer;

import java.lang.invoke.MethodType;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleMod implements ModInitializer {
    // This logger is used to write text to the console and the log file.
    // It is considered best practice to use your mod id as the logger's name.
    // That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("minecraft-but-you-can-only-see-one-chunk");

    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        LOGGER.info(MethodType.methodType(
            void.class, String.class, double.class, double.class, float.class, Function.class, BiConsumer.class, BiFunction.class, Function.class
        ).descriptorString());
    }
}
