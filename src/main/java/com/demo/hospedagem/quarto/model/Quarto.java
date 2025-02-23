package com.demo.hospedagem.quarto.model;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Quarto {
    private int id_quarto;
    private int id_categoria;
    private String tipo;
    private int capacidade;
    private int numero;
    private String status;
    private BigDecimal valor_diaria;

}