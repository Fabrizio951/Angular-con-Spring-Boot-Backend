package senati.com.interfaz_services;
import java.util.List;
import java.util.Optional;

import senati.com.modelo.Usuario;
public interface IUsuarioServices {
	public List<Usuario>listar();
	public Optional<Usuario>listarId(int d);
	public int save(Usuario p);
	public void delete(int id);
}



