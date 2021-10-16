package com.veterinaria.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "Mascota")
public class mascota {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nombre;
	private String raza;
	@ManyToOne
	@JoinColumn (name = "id_usuario")
	private usuario id_usuario;
	private String sexo;
	
	public mascota() {
		
	}
	
	public mascota(String nombre, String raza, usuario id_usuario, String sexo) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.id_usuario = id_usuario;
		this.sexo = sexo;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getRaza() {
		return raza;
	}


	public void setRaza(String raza) {
		this.raza = raza;
	}


	public usuario getId_usuario() {
		return id_usuario;
	}


	public void setId_usuario(usuario id_usuario) {
		this.id_usuario = id_usuario;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
		

}
