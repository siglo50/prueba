package com.kps.prueba.persistence;

import java.util.List;
import java.util.Optional;

import com.kps.prueba.domain.Product;
import com.kps.prueba.domain.repository.ProductRepository;
import com.kps.prueba.persistence.crud.ProductoCrudRepository;
import com.kps.prueba.persistence.entity.Producto;
import com.kps.prueba.persistence.mapper.ProductMapper;

public class ProductoRepository implements ProductRepository {
	
	private ProductoCrudRepository productoCrudRepository;
	private ProductMapper productMapper;
	
	@Override
	public List<Product> getAll(){
		List<Producto> productos = (List<Producto>) productoCrudRepository.findAll();
		return productMapper.toProducts(productos);
	}
	
	@Override
	public Optional<List<Product>> getByCategory(int categoryId) {
		List<Producto> productos = productoCrudRepository.findByIdCategoriaOrderByNombreAsc(categoryId);
		return Optional.of(productMapper.toProducts(productos));
	}

	@Override
	public Optional<List<Product>> getScarseProducts(int quantity) {
		Optional<List<Producto>> listaproductosescasos = productoCrudRepository.findByCantidadStockLessThanAndEstado(quantity);
		return listaproductosescasos.map(prods -> productMapper.toProducts(prods));
	}

	@Override
	public Optional<Product> getProduct(int productId) {
		return productoCrudRepository.findById(productId).map(producto -> productMapper.toProduct(producto));
	}

	@Override
	public Product save(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int productId) {
		// TODO Auto-generated method stub
		
	}

}
