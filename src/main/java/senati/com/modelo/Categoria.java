package senati.com.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "categorias")
public class Categoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_categoria;
	@Column (name="descripcion" , length = 100)
	private String descripcion;

	public Categoria() {
		super();
	}
	public Categoria(int id_categorias, String descripcion) {
		super();
		this.id_categoria = id_categorias;
		this.descripcion = descripcion;
	}
	public int getId_categorias() {
		return id_categoria;
	}
	public void setId_categorias(int id_categorias) {
		this.id_categoria = id_categorias;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
