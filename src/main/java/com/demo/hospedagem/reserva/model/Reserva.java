package com.demo.hospedagem.reserva.model;

import com.demo.hospedagem.quarto.model.Quarto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

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


    public Reserva(LocalDate data_check_in, LocalDate data_check_out, LocalDate data_criacao, int id_cliente, int id_pagamento, int id_reserva, List<Quarto> quartos, String status, BigDecimal valor_total) {
        this.data_check_in = data_check_in;
        this.data_check_out = data_check_out;
        this.data_criacao = data_criacao;
        this.id_cliente = id_cliente;
        this.id_pagamento = id_pagamento;
        this.id_reserva = id_reserva;
        this.quartos = quartos;
        this.status = status;
        this.valor_total = valor_total;
    }

    public LocalDate getData_check_in() {
        return data_check_in;
    }

    public void setData_check_in(LocalDate data_check_in) {
        this.data_check_in = data_check_in;
    }

    public LocalDate getData_check_out() {
        return data_check_out;
    }

    public void setData_check_out(LocalDate data_check_out) {
        this.data_check_out = data_check_out;
    }

    public LocalDate getData_criacao() {
        return data_criacao;
    }

    public void setData_criacao(LocalDate data_criacao) {
        this.data_criacao = data_criacao;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_pagamento() {
        return id_pagamento;
    }

    public void setId_pagamento(int id_pagamento) {
        this.id_pagamento = id_pagamento;
    }

    public int getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(int id_reserva) {
        this.id_reserva = id_reserva;
    }

    public List<Quarto> getQuartos() {
        return quartos;
    }

    public void setQuartos(List<Quarto> quartos) {
        this.quartos = quartos;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigDecimal getValor_total() {
        return valor_total;
    }

    public void setValor_total(BigDecimal valor_total) {
        this.valor_total = valor_total;
    }
}
