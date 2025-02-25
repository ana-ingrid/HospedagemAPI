package com.demo.hospedagem.categoria.model;

import com.demo.hospedagem.beneficio.model.Beneficio;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;

@Data
@AllArgsConstructor
public class Categoria {

    private Integer id_categoria;
    private String nome;
    private String descricao;
    private String status_pagamento;
    private List<Beneficio> beneficio;

}
