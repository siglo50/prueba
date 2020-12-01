package com.kps.prueba.persistence.crud;


import org.springframework.data.repository.CrudRepository;
import com.kps.prueba.persistence.entity.Producto;



public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
	
	
}