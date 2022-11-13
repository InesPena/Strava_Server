package server.data.dto;

import java.io.Serializable;

public class UsuarioDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String nombre;
	private String email;
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
}