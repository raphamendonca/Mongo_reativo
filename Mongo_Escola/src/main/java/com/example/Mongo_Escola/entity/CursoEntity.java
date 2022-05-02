package com.example.Mongo_Escola.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@AllArgsConstructor
@Document( collection = "Cursos")
public class CursoEntity {

    @NotNull
    @Indexed(name = "codigo_curso",background = true, direction = IndexDirection.DESCENDING)
    private Long codigo;
    @NotBlank
    private String name;
    private String description;
    @NotBlank
    private String periodo;
    @NotNull @Valid
    private List<ModuloEntity> modulos;

}
