package com.demo.hospedagem.beneficio.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Beneficio {

    private Integer id_beneficio;
    private String nome;
    private String descricao;
}