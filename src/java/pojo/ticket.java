package pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ticket")
public class ticket {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="producto")
	private String producto;
	
	@Column(name="asunto")
	private String asunto;
	
	@Column(name="comentario")
	private String comentario;
	
	@Column(name="foto")
	private String foto;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="correo")
	private String correo;
	
	@Column(name="telefono")
	private String telefono;
	
	
	public ticket() {
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getProducto() {
		return producto;
	}


	public void setProducto(String producto) {
		this.producto = producto;
	}


	public String getAsunto() {
		return asunto;
	}


	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}


	public String getComentario() {
		return comentario;
	}


	public void setComentario(String comentario) {
		this.comentario = comentario;
	}


	public String getFoto() {
		return foto;
	}


	public void setFoto(String foto) {
		this.foto = foto;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	@Override
	public String toString() {
		return "ticket [id=" + id + ", producto=" + producto + ", asunto=" + asunto + ", comentario=" + comentario
				+ ", foto=" + foto + ", nombre=" + nombre + ", correo=" + correo + ", telefono=" + telefono + "]";
	}


	

	
	


		
}





