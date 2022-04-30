package com.example.Mongo_Escola.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ModuloEntity {

    private Long id;
    private String name;
    private ProfessorEntity teacher;

}
