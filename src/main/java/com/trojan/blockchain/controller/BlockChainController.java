package com.trojan.blockchain.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.trojan.blockchain.dto.BlockInfoDto;
import com.trojan.blockchain.entity.Block;
import com.trojan.blockchain.service.BlockService;

@RestController
public class BlockChainController {

	@Autowired
	private BlockService service;
	
	@PostMapping("/block/create")
	public ResponseEntity<String> createBlock(@Valid @RequestBody BlockInfoDto blockInfoDto) {
		Block block = service.saveBlock(blockInfoDto);
		return new ResponseEntity<>(
				"Current Block : " + block.getBlock() + " -> Next Block : " + block.getNextBlock(),
				HttpStatus.OK);
	}
}
