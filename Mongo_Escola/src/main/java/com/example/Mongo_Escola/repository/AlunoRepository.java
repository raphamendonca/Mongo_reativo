package com.example.Mongo_Escola.repository;

import com.example.Mongo_Escola.entity.AlunoEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlunoRepository extends MongoRepository<AlunoEntity, Long> {

    List<AlunoEntity> findAllByCodigoCurso(Long codigoCurso);

}
