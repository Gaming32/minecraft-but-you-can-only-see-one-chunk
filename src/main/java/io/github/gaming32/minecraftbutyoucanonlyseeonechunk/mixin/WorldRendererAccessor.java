package io.github.gaming32.minecraftbutyoucanonlyseeonechunk.mixin;

import java.util.concurrent.atomic.AtomicReference;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.client.render.WorldRenderer;
import net.minecraft.client.render.WorldRenderer.ChunkInfo;
import net.minecraft.client.render.WorldRenderer.class_6600;

@Mixin(WorldRenderer.class)
public interface WorldRendererAccessor {
    @Accessor
    public ObjectArrayList<ChunkInfo> getChunkInfos();

    @Accessor
    public AtomicReference<class_6600> getField_34817();
}
