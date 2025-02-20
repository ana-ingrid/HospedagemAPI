package com.demo.hospedagem.cliente.model;

import lombok.*;

import java.time.LocalDate;

public class Cliente {

    private Integer id_cliente;
    private String nome;
    private String email;
    private String cpf;
    private String telefone;
    private LocalDate data_de_nascimento;
    private List<Reserva> reservas;
    private Endereco endereco;

    public Cliente(Integer id_cliente, String nome, String email, String cpf, String telefone, LocalDate data_de_nascimento, List<Reserva> reservas, Endereco endereco) {
        this.id_cliente = id_cliente;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.telefone = telefone;
        this.data_de_nascimento = data_de_nascimento;
        this.reservas = reservas;
        this.endereco = endereco;
    }


    public Integer getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getData_de_nascimento() {
        return data_de_nascimento;
    }

    public void setData_de_nascimento(LocalDate data_de_nascimento) {
        this.data_de_nascimento = data_de_nascimento;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
