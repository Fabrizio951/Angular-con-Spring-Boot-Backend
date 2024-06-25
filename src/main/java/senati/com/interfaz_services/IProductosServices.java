package senati.com.interfaz_services;
import java.util.List;
import java.util.Optional;

import senati.com.modelo.Productos;
public interface IProductosServices {
	public List<Productos>listar();
	public Optional<Productos>listarId(int d);
	public int save(Productos p);
	public void delete(int id);
}
