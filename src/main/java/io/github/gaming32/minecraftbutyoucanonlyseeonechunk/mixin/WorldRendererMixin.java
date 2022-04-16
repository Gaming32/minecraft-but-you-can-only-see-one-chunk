package io.github.gaming32.minecraftbutyoucanonlyseeonechunk.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.Frustum;
import net.minecraft.client.render.WorldRenderer;
import net.minecraft.client.render.WorldRenderer.ChunkInfo;
import net.minecraft.util.math.ChunkPos;

@Mixin(WorldRenderer.class)
public class WorldRendererMixin {
    @Overwrite
    private void applyFrustum(Frustum frustum) {
        @SuppressWarnings("resource")
        ChunkPos playerChunk = MinecraftClient.getInstance().player.getChunkPos();
        WorldRendererAccessor accessor = (WorldRendererAccessor)(Object)this;
        accessor.getChunkInfos().clear();
        for (ChunkInfo chunk : accessor.getField_34817().get().field_34819) {
            ChunkPos chunkPos = new ChunkPos(((ChunkInfoAccessor)chunk).getChunk().getOrigin());
            if (chunkPos.equals(playerChunk)) {
                accessor.getChunkInfos().add(chunk);
            }
        }
    }
}
