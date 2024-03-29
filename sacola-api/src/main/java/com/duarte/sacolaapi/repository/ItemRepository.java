package com.duarte.sacolaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.duarte.sacolaapi.model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

}
