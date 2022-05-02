package com.example.Mongo_Escola.service;

import com.example.Mongo_Escola.controller.CursoResponse;
import com.example.Mongo_Escola.entity.AlunoEntity;
import com.example.Mongo_Escola.entity.CursoEntity;
import com.example.Mongo_Escola.repository.AlunoRepository;
import com.example.Mongo_Escola.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;
    @Autowired
    private AlunoRepository alunoRepository;

    public CursoEntity cadastrarCurso(CursoEntity request){

        return cursoRepository.save(request);

    }

    public CursoResponse buscarDetalheCurso(Long codigo){
        return new CursoResponse(
                cursoRepository.findByCodigo(codigo),
                alunoRepository.findAllByCodigoCurso(codigo)
        );
    }

    public AlunoEntity cadastrarAluno(AlunoEntity request){
        return alunoRepository.save(request);
    }



}
