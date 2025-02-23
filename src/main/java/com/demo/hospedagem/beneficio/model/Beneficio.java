package com.demo.hospedagem.beneficio.model;

import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Beneficio {

    private Integer id_beneficio;
    private String nome;
    private String descricao;
}