package com.kps.prueba.domain.repository;

import java.util.List;
import java.util.Optional;

import com.kps.prueba.domain.Product;
import com.kps.prueba.persistence.entity.Producto;

public interface ProductRepository {
	
	List<Product> getAll();
	Optional<List<Product>> getByCategory(int categoryId);
	Optional<List<Product>> getScarseProducts(int quantity);
	Optional<Product> getProduct(int productId);
	Product save(Product product);
	void delete(int productId);

}
