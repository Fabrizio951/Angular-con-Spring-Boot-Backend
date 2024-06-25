package senati.com.interfaz;

import org.springframework.data.repository.CrudRepository;

import senati.com.modelo.Productos;

public interface IProductos extends CrudRepository<Productos, Integer>{

}
