package com.example.serviceb.models;

import lombok.Data;

@Data
public class Competicao {
    private Long id;
    private String competicao;
    private String local;
    private String tipoSkate;

    private Skatista skatista;
}
