package senati.com.interfaz;

import org.springframework.data.repository.CrudRepository;
import senati.com.modelo.Categoria;

public interface ICategoria extends CrudRepository<Categoria, Integer> {

}
