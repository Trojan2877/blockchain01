package com.trojan.blockchain.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.trojan.blockchain.entity.Block;

public interface BlockChainRepo extends MongoRepository<Block, String>{

}
