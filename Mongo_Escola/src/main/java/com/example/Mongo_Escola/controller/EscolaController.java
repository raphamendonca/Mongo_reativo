package com.example.Mongo_Escola.controller;

import com.example.Mongo_Escola.entity.AlunoEntity;
import com.example.Mongo_Escola.entity.CursoEntity;
import com.example.Mongo_Escola.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class EscolaController {

    @Autowired
    private CursoService service;

    @PostMapping("/cursos")
    public ResponseEntity cadastrarCurso(
           @RequestBody @Valid CursoEntity request
    ){
        return ResponseEntity.ok(service.cadastrarCurso(request));
    }

    @GetMapping("/cursos/{codigo}")
    public ResponseEntity<CursoResponse> listarDadosCurso(
            @PathVariable(name = "codigo") Long codigo
    ){
        return ResponseEntity.ok(service.buscarDetalheCurso(codigo));
    }

    @PostMapping("/alunos")
    public ResponseEntity cadastrarAluno(
            @RequestBody AlunoEntity request
    ){
        return ResponseEntity.ok(service.cadastrarAluno(request));
    }
//    @GetMapping("/cursos")


    @PutMapping("/cursos/{id}")
    public ResponseEntity atualizarCampos(
            CursoEntity curso
    )
    {
        /*
            find by id

            alterar se nao todos quase todos
         */
        return null;
    }


    @PatchMapping("/cursos/{id}")
    public ResponseEntity atualizarCampos(
            //body atualizacao
    )
    {

        /*
        status = inativo
        service
            find by id
            updateStatus

        { "op": "update", path" : status, value inactive¨}
         */
        return null;
    }

}
