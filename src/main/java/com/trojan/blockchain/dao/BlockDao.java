package com.trojan.blockchain.dao;

import com.trojan.blockchain.dto.BlockInfoDto;
import com.trojan.blockchain.model.Block;

public interface BlockDao {

	Block saveBlock(BlockInfoDto blockInfoDto);

}
