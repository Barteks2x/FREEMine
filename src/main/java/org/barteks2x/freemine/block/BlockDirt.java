package org.barteks2x.freemine.block;

public class BlockDirt extends Block {

	public BlockDirt(int id) {
		super(id, "Dirt");
	}

	@Override
	public int getTextureForSide(int side) {
		return 3;
	}
}