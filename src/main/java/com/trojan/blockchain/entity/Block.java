package com.trojan.blockchain.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Block")
public class Block {

	@Id
	private String id;
	
	private String block;
	
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

	public Block(String id, String block, String nextBlock) {
		super();
		this.id = id;
		this.block = block;
		this.nextBlock = nextBlock;
	}
	
	
}
