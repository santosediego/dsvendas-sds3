package com.santosediego.dsvendas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.santosediego.dsvendas.dto.SaleDTO;
import com.santosediego.dsvendas.entities.Sale;
import com.santosediego.dsvendas.repositories.SaleRepository;
import com.santosediego.dsvendas.repositories.SellerRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;

	@Autowired
	private SellerRepository sellerRepository;

	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable) {
		
		// indicado somente neste caso que estou com poucos registros;
		sellerRepository.findAll();
		
		Page<Sale> result = repository.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}

}