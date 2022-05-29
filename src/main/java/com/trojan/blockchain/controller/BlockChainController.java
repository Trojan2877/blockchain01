package com.trojan.blockchain.controller;

import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.trojan.blockchain.dto.BlockInfoDto;
import com.trojan.blockchain.entity.Block;
import com.trojan.blockchain.repo.BlockChainRepo;

@RestController
public class BlockChainController {

	@Autowired
	private BlockChainRepo blockRepo;
	
	@PostMapping("/block/create")
	public ResponseEntity<String> createBlock(@Valid @RequestBody BlockInfoDto blockInfoDto) {
		
		blockRepo.save( new Block(UUID.randomUUID().toString(), blockInfoDto.getThisBlock(), blockInfoDto.getNextBlock()));
		
		return new ResponseEntity<>("Current Block : "+blockInfoDto.getThisBlock()+" -> Next Block : " + blockInfoDto.getNextBlock(), HttpStatus.OK);
	}
}
