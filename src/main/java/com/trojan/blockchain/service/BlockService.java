package com.trojan.blockchain.service;

import com.trojan.blockchain.dto.BlockInfoDto;
import com.trojan.blockchain.entity.Block;

public interface BlockService {

	Block saveBlock(BlockInfoDto blockInfoDto);

}
