package com.trojan.blockchain.util;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.UUID;

import com.trojan.blockchain.dto.BlockInfoDto;
import com.trojan.blockchain.model.Block;

public class Transformer {

	public static Block toBlockEntity(BlockInfoDto blockInfoDto) {
		Block block = new Block(UUID.randomUUID().toString(), blockInfoDto.getThisBlock().hashCode(), blockInfoDto.getNextBlock().hashCode());
		ZoneId zone = ZoneId.of("Asia/Kolkata");
		LocalDateTime today = LocalDateTime.now(zone);
		block.setCreatedOn(today);
		return block;
	}
	
}
