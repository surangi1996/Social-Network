package com.example.socialnetwork.repository;

import com.example.socialnetwork.model.FeedBack;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FeedBackRepository extends MongoRepository<FeedBack, Integer> {
}
