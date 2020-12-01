package com.kps.prueba.persistence.entity;

import java.util.List;

import com.kps.prueba.persistence.crud.ProductoCrudRepository;

public class ProductoRepository {
	
	private ProductoCrudRepository productoCrudRepository;
	
	public List<Producto> getAll(){
		
		return (List<Producto>) productoCrudRepository.findAll();
	}

}
