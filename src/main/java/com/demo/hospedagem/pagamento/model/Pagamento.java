package com.demo.hospedagem.pagamento.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
public class Pagamento {

    private Integer id_pagamento;
    private Integer id_reserva;
    private LocalDate data_pagamento;
    private BigDecimal valor_pago;
    private String metodo_pagamento;
    private String status_pagamento;

}