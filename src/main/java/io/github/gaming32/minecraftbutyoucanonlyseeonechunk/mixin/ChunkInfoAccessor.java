package io.github.gaming32.minecraftbutyoucanonlyseeonechunk.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import net.minecraft.client.render.WorldRenderer;
import net.minecraft.client.render.chunk.ChunkBuilder;

@Mixin(WorldRenderer.ChunkInfo.class)
public interface ChunkInfoAccessor {
    @Accessor
    public ChunkBuilder.BuiltChunk getChunk();
}
