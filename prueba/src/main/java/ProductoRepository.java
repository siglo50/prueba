

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.kps.prueba.persistence.crud.ProductoCrudRepository;
import com.kps.prueba.persistence.entity.Producto;


@Repository
public class ProductoRepository {
	
	private ProductoCrudRepository productoCrudRepository;
	
	public List<Producto> getAll(){	
		return (List<Producto>) productoCrudRepository.findAll();
	}
	
	public List<Producto> getByCategoria(int idCategoria){
		return productoCrudRepository.findByIdCategoriaOrderByNombreAsc(idCategoria);
	}
	
	public Optional<Producto> getProducto(int idProducto){
		return productoCrudRepository.findById(idProducto);
	}
	
	public Producto save(Producto producto){
		return productoCrudRepository.save(producto);
	}
	
	public void delete(int idProducto){
		productoCrudRepository.deleteById(idProducto);
	}

}
