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

import senati.com.interfaz.IUsuario;
import senati.com.modelo.Usuario;


@RestController
@RequestMapping("/rest_user")
@CrossOrigin(origins = "http://localhost:4200")
public class RestUsuario {
	@Autowired
	private IUsuario data;

	@GetMapping("/listar")
	public List<Usuario> listar() {
		return (List<Usuario>) data.findAll();
	}

	@GetMapping(value = "/buscar/{id}")
	public Optional<Usuario> listarId(@PathVariable("id") Integer id) {
		return data.findById(id);
	}

	@PostMapping("/insertar")
	public void insertar(@RequestBody Usuario per) {
		data.save(per);
	}

	@PutMapping("/modificar")
	public void modificar(@RequestBody Usuario per) {
		data.save(per);
	}

	@DeleteMapping(value = "/eliminar/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		data.deleteById(id);
	}
	
    @PostMapping("/login")
    public boolean login(@RequestBody Usuario usuario) {
        Optional<Usuario> user = data.findByNombreAndContrasena(usuario.getNombre(), usuario.getContrasena());
        return user.isPresent();
    }
}
