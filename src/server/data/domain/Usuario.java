package server.data.domain;

import java.util.List;

public class Usuario {
	
	private String nombre;
	private String email;
	private String contrasenya;
	private String fechaNac;
	private float peso;
	private int altura;
	private int frecCardMax;
	private int frecCardReposo;
	private List<Reto> retosAceptados;

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

	public boolean checkContrasenya(String contrasenya) {
		return this.contrasenya.equals(contrasenya);
	}

	public void setContrasenya(String contrasenya) {
		this.contrasenya = contrasenya;
	}

	public String getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getFrecCardMax() {
		return frecCardMax;
	}

	public void setFrecCardMax(int frecCardMax) {
		this.frecCardMax = frecCardMax;
	}

	public int getFrecCardReposo() {
		return frecCardReposo;
	}

	public void setFrecCardReposo(int frecCardReposo) {
		this.frecCardReposo = frecCardReposo;
	}

	public List<Reto> getRetosAceptados() {
		return retosAceptados;
	}

	public void setRetosAceptados(List<Reto> retosAceptados) {
		this.retosAceptados = retosAceptados;
	}
	
	public void addReto(Reto reto) {
		if (reto!= null && !this.retosAceptados.contains(reto)) {
			this.retosAceptados.add(reto);
		}
	}
}
