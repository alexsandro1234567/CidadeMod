package com.exemplo.cidademod.item;

import com.exemplo.cidademod.entity.CidadeNPC;
import com.exemplo.cidademod.entity.ModEntities;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import net.minecraft.block.Blocks;

public class CityWandItem extends Item {
    public CityWandItem(Properties properties) {
        super(properties);
    }
    
    @Override
    public InteractionResult useOn(UseOnContext context) {
        if (context.getLevel().isClientSide()) {
            return InteractionResult.SUCCESS;
        }
        
        BlockPos pos = context.getClickedPos();
        Level world = context.getLevel();
        Player player = context.getPlayer();
        
        // Gera a cidade
        gerarCidade(world, pos);
        
        return InteractionResult.CONSUME;
    }
    
    private void gerarCidade(Level world, BlockPos pos) {
        // Gera estruturas básicas
        gerarPraca(world, pos);
        gerarCasas(world, pos);
        spawnNPCs(world, pos);
    }
    
    private void gerarPraca(Level world, BlockPos pos) {
        // Gera praça central
        for(int x = -5; x <= 5; x++) {
            for(int z = -5; z <= 5; z++) {
                world.setBlock(pos.offset(x, 0, z), 
                    Blocks.STONE_BRICKS.defaultBlockState(), 
                    3);
            }
        }
    }
    
    private void spawnNPCs(Level world, BlockPos pos) {
        // Cria NPCs customizados
        CidadeNPC comerciante = new CidadeNPC(ModEntities.CIDADE_NPC.get(), world);
        comerciante.setPos(pos.getX() + 2, pos.getY() + 1, pos.getZ() + 2);
        comerciante.setCustomName(Component.literal("Comerciante"));
        world.addFreshEntity(comerciante);
        
        CidadeNPC guarda = new CidadeNPC(ModEntities.CIDADE_NPC.get(), world);
        guarda.setPos(pos.getX() - 2, pos.getY() + 1, pos.getZ() - 2);
        guarda.setCustomName(Component.literal("Guarda"));
        world.addFreshEntity(guarda);
    }
} 