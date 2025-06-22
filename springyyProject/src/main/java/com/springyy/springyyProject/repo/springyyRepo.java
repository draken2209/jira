package com.springyy.springyyProject.repo;

import com.springyy.springyyProject.entity.springyyPojos;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface springyyRepo extends MongoRepository<springyyPojos, UUID> {

}
