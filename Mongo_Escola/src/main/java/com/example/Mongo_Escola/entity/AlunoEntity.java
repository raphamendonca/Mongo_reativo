package com.example.Mongo_Escola.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;



@Data
@AllArgsConstructor
@Document(collection = "Alunos")
public class AlunoEntity {

    private Long matricula;
    private String nome;
    private Long codigoCurso;

}
