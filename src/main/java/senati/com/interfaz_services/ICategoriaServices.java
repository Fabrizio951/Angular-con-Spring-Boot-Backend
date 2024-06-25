package senati.com.interfaz_services;

import java.util.List;
import java.util.Optional;

import senati.com.modelo.Categoria;
public interface ICategoriaServices {
	public List<Categoria>listar();
	public Optional<Categoria>listarId(int d);
	public int save(Categoria p);
	public void delete(int id);
}
