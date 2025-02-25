package com.demo.hospedagem.cliente.model;

import com.demo.hospedagem.endereco.model.Endereco;
import com.demo.hospedagem.reserva.model.Reserva;
import java.util.List;
import lombok.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
public class Cliente {

    private Integer id_cliente;
    private String nome;
    private String email;
    private String cpf;
    private String telefone;
    private LocalDate data_de_nascimento;
    private List<Reserva> reservas;
    private Endereco endereco;


}
