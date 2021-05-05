package com.santosediego.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.santosediego.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}