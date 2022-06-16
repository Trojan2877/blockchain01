package com.trojan.blockchain.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.trojan.blockchain.dto.BlockInfoDto;
import com.trojan.blockchain.entity.Block;
import com.trojan.blockchain.repo.BlockChainRepo;
import com.trojan.blockchain.util.Transformer;

@Repository
public class BlockDaoImpl implements BlockDao {

	@Autowired
	private BlockChainRepo blockRepo;
	
	@Override
	public Block saveBlock(BlockInfoDto blockInfoDto) {
		Block block = Transformer.toBlockEntity(blockInfoDto);
		return blockRepo.save(block);
	}
	
}
