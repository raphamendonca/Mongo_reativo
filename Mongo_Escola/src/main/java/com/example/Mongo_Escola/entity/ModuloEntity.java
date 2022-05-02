package com.example.Mongo_Escola.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
public class ModuloEntity {

    private Long id;
    @NotBlank
    private String name;
    @NotNull @Valid
    private ProfessorEntity teacher;

}
