package com.codenamerevy.additionalbars.content.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class TestBlock extends Block
{
    private static final VoxelShape SHAPE = Block.createCuboidShape(0.0F, 0.0F, 6.0F, 16.0F, 16.0F, 8.0F);

    public TestBlock(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context)
    {
        return SHAPE;
    }
}
