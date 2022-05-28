package com.trojan.blockchain.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.trojan.blockchain.entity.Block;

@RestController
public class BlockChainController {

	@PostMapping("/block/create")
	public ResponseEntity<String> createBlock(@Valid @RequestBody Block block) {
		
		return new ResponseEntity<>("Current Block : "+block.getBlock()+" -> Next Block : " + block.getNextBlock(), HttpStatus.OK);
	}
}
