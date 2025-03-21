package com.demo.hospedagem.beneficio.repository;

import com.demo.hospedagem.beneficio.model.Beneficio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeneficioRepository extends JpaRepository<Beneficio, Integer> {
}
