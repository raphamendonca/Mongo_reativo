package com.example.Mongo_Escola.service;

import com.example.Mongo_Escola.entity.CursoEntity;
import com.example.Mongo_Escola.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    public CursoEntity cadastrarCurso(CursoEntity request){

        return cursoRepository.save(request);

    }

}
