package com.duarte.sacolaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.duarte.sacolaapi.model.Sacola;

@Repository
public interface SacolaRepository extends JpaRepository<Sacola, Long>{

}