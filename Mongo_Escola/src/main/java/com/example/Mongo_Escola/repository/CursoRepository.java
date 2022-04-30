package com.example.Mongo_Escola.repository;

import com.example.Mongo_Escola.entity.CursoEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends MongoRepository<CursoEntity, Long> {
}
