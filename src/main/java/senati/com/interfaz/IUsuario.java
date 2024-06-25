package senati.com.interfaz;

import org.springframework.data.repository.CrudRepository;
import java.util.Optional;
import senati.com.modelo.Usuario;

public interface IUsuario extends CrudRepository<Usuario, Integer>{
	Optional<Usuario> findByNombreAndContrasena(String nombre, String contrasena);
}
