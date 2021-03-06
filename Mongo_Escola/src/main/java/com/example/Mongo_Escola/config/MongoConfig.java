package com.example.Mongo_Escola.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.convert.DefaultMongoTypeMapper;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.data.mongodb.core.index.Index;

import javax.annotation.PostConstruct;

@Configuration
public class MongoConfig {

    @Autowired
    private MappingMongoConverter mappingMongoConverter;

    @Autowired
    private MongoTemplate mongoTemplate;

    @PostConstruct
    public void setMappingMongoConverter(){
        mappingMongoConverter.setTypeMapper(new DefaultMongoTypeMapper(null));

//        mongoTemplate.indexOps("Cusos").ensureIndex(new Index().on())
    }

}
