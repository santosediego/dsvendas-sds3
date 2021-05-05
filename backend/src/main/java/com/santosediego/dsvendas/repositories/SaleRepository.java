package com.santosediego.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.santosediego.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}