package com.veterinaria.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Colaborador")
public class colaborador {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nombre;
	private String apellido;
	private String cargo;
	private String especialidad;
	private String tipo_documento;
	private int documento_identificacion;
	
	
	public colaborador() {
		
	}
	
	public colaborador(String nombre, String apellido, String cargo, String especialidad, String tipo_documento,
			int documento_identificacion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.cargo = cargo;
		this.especialidad = especialidad;
		this.tipo_documento = tipo_documento;
		this.documento_identificacion = documento_identificacion;
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


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	public String getEspecialidad() {
		return especialidad;
	}


	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
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
	
}
