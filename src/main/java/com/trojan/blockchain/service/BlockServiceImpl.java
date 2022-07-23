package com.trojan.blockchain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trojan.blockchain.dao.BlockDao;
import com.trojan.blockchain.dto.BlockInfoDto;
import com.trojan.blockchain.model.Block;

@Service
public class BlockServiceImpl implements BlockService {

	@Autowired
	private BlockDao dao;
	
	@Override
	public Block saveBlock(BlockInfoDto blockInfoDto) {
		return dao.saveBlock(blockInfoDto);
		 
	}
	
}
