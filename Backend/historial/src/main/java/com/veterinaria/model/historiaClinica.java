package com.veterinaria.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table (name = "Historia_Clinica")
public class historiaClinica {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@OneToOne
	@JoinColumn (name = "id_mascota")
	private mascota id_mascota;
	private int fecha;
	
	public historiaClinica() {
		
	}
	
	public historiaClinica(mascota id_mascota, int fecha) {
		super();
		this.id_mascota = id_mascota;
		this.fecha = fecha;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public mascota getId_mascota() {
		return id_mascota;
	}


	public void setId_mascota(mascota id_mascota) {
		this.id_mascota = id_mascota;
	}


	public int getFecha() {
		return fecha;
	}


	public void setFecha(int fecha) {
		this.fecha = fecha;
	}
	
	
	
	

}
