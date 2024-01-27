package com.duarte.sacolaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.duarte.sacolaapi.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
