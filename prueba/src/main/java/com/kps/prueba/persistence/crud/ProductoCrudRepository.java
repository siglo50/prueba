package com.kps.prueba.persistence.crud;


import java.util.List;
import java.util.Optional;

//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.kps.prueba.persistence.entity.Producto;



public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
	
	//native query
	//@Query(value = "SELECT * FROM productos WHERE id_categoria = ?", nativeQuery = true)
	//query methods
	List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);
	
	Optional<List<Producto>> findByPrecioVentaLessThanAndIdCategoriaOrderByNombreAsc(int precioVenta, int idCategoria);

	Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidad);
	
}