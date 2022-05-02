package com.example.Mongo_Escola.controller;

import com.example.Mongo_Escola.entity.AlunoEntity;
import com.example.Mongo_Escola.entity.CursoEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CursoResponse {
    private CursoEntity curso;
    private List<AlunoEntity> alunos;

}
