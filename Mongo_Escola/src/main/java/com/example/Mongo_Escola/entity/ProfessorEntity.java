package com.example.Mongo_Escola.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
public class ProfessorEntity {

    @NotBlank
    private String name;
    @NotBlank
    private String language;

}
