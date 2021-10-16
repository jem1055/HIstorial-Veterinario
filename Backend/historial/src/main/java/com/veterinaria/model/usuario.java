package com.veterinaria.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Usuario")
public class usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nombre;
	private String apellido;
	private String tipo_documento;
	private int documento_identificacion;
	private String estado;
	private int sexo;
	
	public usuario() {
		
	}
	
	public usuario(String nombre, String apellido, String tipo_documento, int documento_identificacion, String estado,
			int sexo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.tipo_documento = tipo_documento;
		this.documento_identificacion = documento_identificacion;
		this.estado = estado;
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


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getTipo_documento() {
		return tipo_documento;
	}


	public void setTipo_documento(String tipo_documento) {
		this.tipo_documento = tipo_documento;
	}


	public int getDocumento_identificacion() {
		return documento_identificacion;
	}


	public void setDocumento_identificacion(int documento_identificacion) {
		this.documento_identificacion = documento_identificacion;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public int getSexo() {
		return sexo;
	}


	public void setSexo(int sexo) {
		this.sexo = sexo;
	}
	
	
}
