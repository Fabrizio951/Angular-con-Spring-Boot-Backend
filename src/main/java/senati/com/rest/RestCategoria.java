package senati.com.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import senati.com.interfaz.ICategoria;
import senati.com.modelo.Categoria;

@RestController
@RequestMapping("/rest_cat")
@CrossOrigin(origins = "http://localhost:4200")
public class RestCategoria {

	@Autowired
	private ICategoria data;

	@GetMapping("/listar")
	public List<Categoria> listar() {
		return (List<Categoria>) data.findAll();
	}

	@GetMapping(value = "/buscar/{id}")
	public Optional<Categoria> listarId(@PathVariable("id") Integer id) {
		return data.findById(id);
	}

	@PostMapping("/insertar")
	public void insertar(@RequestBody Categoria per) {
		data.save(per);
	}

	@PutMapping("/modificar")
	public void modificar(@RequestBody Categoria per) {
		data.save(per);
	}

	@DeleteMapping(value = "/eliminar/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		data.deleteById(id);
	}
}