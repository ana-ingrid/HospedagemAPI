package com.demo.hospedagem.reserva.model;

import com.demo.hospedagem.quarto.model.Quarto;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
public class Reserva {

    private int id_reserva;
    private int id_cliente;
    private int id_pagamento;
    private LocalDate data_check_in;
    private LocalDate data_check_out;
    private String status;
    private BigDecimal valor_total;
    private LocalDate data_criacao;
    private List<Quarto> quartos;

}