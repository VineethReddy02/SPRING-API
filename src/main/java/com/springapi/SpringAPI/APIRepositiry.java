package com.springapi.SpringAPI;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface APIRepositiry extends MongoRepository<Data_Entity, String> {
	

}
