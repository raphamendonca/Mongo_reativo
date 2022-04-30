package com.example.Mongo_Escola.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@Document( collection = "Cursos")
public class CursoEntity {

    @Indexed(name = "codigo_curso",background = true, direction = IndexDirection.DESCENDING)
    private Long codigo;
    private String name;
    private String description;
    private String periodo;
    private List<ModuloEntity> modulos;

}
