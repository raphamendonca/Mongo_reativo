package com.example.Mongo_Escola.controller;

import com.example.Mongo_Escola.entity.CursoEntity;
import com.example.Mongo_Escola.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CursoController {

    @Autowired
    private CursoService service;

    @PostMapping("/cursos")
    public ResponseEntity cadastrarCurso(
            @RequestBody CursoEntity request
    ){
        return ResponseEntity.ok(service.cadastrarCurso(request));
    }

//    @GetMapping("/cursos")


}
