package com.demo.hospedagem.pagamento.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Pagamento {

    private Integer id_pagamento;
    private Integer id_reserva;
    private LocalDate data_pagamento;
    private BigDecimal valor_pago;
    private String metodo_pagamento;
    private String status_pagamento;

    public Pagamento(Integer id_pagamento, Integer id_reserva, LocalDate data_pagamento, BigDecimal valor_pago, String metodo_pagamento, String status_pagamento) {
        this.id_pagamento = id_pagamento;
        this.id_reserva = id_reserva;
        this.data_pagamento = data_pagamento;
        this.valor_pago = valor_pago;
        this.metodo_pagamento = metodo_pagamento;
        this.status_pagamento = status_pagamento;
    }

    public Integer getId_pagamento() {
        return id_pagamento;
    }

    public void setId_pagamento(Integer id_pagamento) {
        this.id_pagamento = id_pagamento;
    }

    public Integer getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(Integer id_reserva) {
        this.id_reserva = id_reserva;
    }

    public LocalDate getData_pagamento() {
        return data_pagamento;
    }

    public void setData_pagamento(LocalDate data_pagamento) {
        this.data_pagamento = data_pagamento;
    }

    public BigDecimal getValor_pago() {
        return valor_pago;
    }

    public void setValor_pago(BigDecimal valor_pago) {
        this.valor_pago = valor_pago;
    }

    public String getMetodo_pagamento() {
        return metodo_pagamento;
    }

    public void setMetodo_pagamento(String metodo_pagamento) {
        this.metodo_pagamento = metodo_pagamento;
    }

    public String getStatus_pagamento() {
        return status_pagamento;
    }

    public void setStatus_pagamento(String status_pagamento) {
        this.status_pagamento = status_pagamento;
    }
}
