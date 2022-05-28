package com.trojan.blockchain.entity;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;

public class Block {

	@Valid
	@NotEmpty(message = "Block is empty!!")
	private String block;
	
	@Valid
	@NotEmpty(message = "Next Block is empty!!")
	private String nextBlock;

	public String getBlock() {
		return block;
	}

	public void setBlock(String block) {
		this.block = block;
	}

	public String getNextBlock() {
		return nextBlock;
	}

	public void setNextBlock(String nextBlock) {
		this.nextBlock = nextBlock;
	}
	
}
