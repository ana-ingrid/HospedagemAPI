package com.demo.hospedagem.quarto.repository;

import com.demo.hospedagem.quarto.model.Quarto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuartoRepository extends JpaRepository<Quarto, Integer> {
}
