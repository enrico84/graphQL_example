package com.graphql.java.news.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.graphql.java.news.model.Veicolo;

public interface VeicoloRepository extends JpaRepository<Veicolo, Integer> {

}
