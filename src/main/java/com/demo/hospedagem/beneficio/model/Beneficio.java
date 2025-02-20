package com.demo.hospedagem.beneficio.model;

import jakarta.persistence.criteria.CriteriaBuilder;

public class Beneficio {

    private Integer id_beneficio;
    private String nome;
    private String descricao;

    public Beneficio(Integer id_beneficio, String nome, String descricao) {
        this.id_beneficio = id_beneficio;
        this.nome = nome;
        this.descricao = descricao;
    }


    public Integer getId_beneficio() {
        return id_beneficio;
    }

    public void setId_beneficio(Integer id_beneficio) {
        this.id_beneficio = id_beneficio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
