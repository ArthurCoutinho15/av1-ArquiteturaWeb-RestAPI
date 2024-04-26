package com.example.AV1_API.repository;

import com.example.AV1_API.model.NewsEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface NewsRepository extends MongoRepository<NewsEntity, String> {
}
