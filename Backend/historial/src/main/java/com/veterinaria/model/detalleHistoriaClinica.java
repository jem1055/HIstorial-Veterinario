package com.veterinaria.model;

import java.sql.Timestamp;    
import java.util.Date;    
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;


@Entity
@Table (name = "Detalle_Historia_Clinica")
public class detalleHistoriaClinica {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String temperatura;
	private int peso;
	private int frecuencia_cardiaca;
	private int frecuencia_respiratoria;
	Timestamp fecha_hora=new Timestamp(System.currentTimeMillis()); 
	private String alimentacion;
	private String habitad;
	private String observacion;
	@OneToOne
	@JoinColumn (name = "id_colaborador")
	private colaborador id_colaborador;
	@ManyToOne
	@JoinColumn (name = "id_historia_clinica")
	private historiaClinica id_historia_clinica;
	
	public detalleHistoriaClinica() {
		
	}
	
	public detalleHistoriaClinica(String temperatura, int peso, int frecuencia_cardiaca, int frecuencia_respiratoria,
			Date date, Timestamp fecha_hora, String alimentacion, String habitad, String observacion,
			colaborador id_colaborador, historiaClinica id_historia_clinica) {
		super();
		this.temperatura = temperatura;
		this.peso = peso;
		this.frecuencia_cardiaca = frecuencia_cardiaca;
		this.frecuencia_respiratoria = frecuencia_respiratoria;
		this.fecha_hora = fecha_hora;
		this.alimentacion = alimentacion;
		this.habitad = habitad;
		this.observacion = observacion;
		this.id_colaborador = id_colaborador;
		this.id_historia_clinica = id_historia_clinica;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTemperatura() {
		return temperatura;
	}


	public void setTemperatura(String temperatura) {
		this.temperatura = temperatura;
	}


	public int getPeso() {
		return peso;
	}


	public void setPeso(int peso) {
		this.peso = peso;
	}


	public int getFrecuencia_cardiaca() {
		return frecuencia_cardiaca;
	}


	public void setFrecuencia_cardiaca(int frecuencia_cardiaca) {
		this.frecuencia_cardiaca = frecuencia_cardiaca;
	}


	public int getFrecuencia_respiratoria() {
		return frecuencia_respiratoria;
	}


	public void setFrecuencia_respiratoria(int frecuencia_respiratoria) {
		this.frecuencia_respiratoria = frecuencia_respiratoria;
	}


	public Timestamp getFecha_hora() {
		return fecha_hora;
	}


	public void setFecha_hora(Timestamp fecha_hora) {
		this.fecha_hora = fecha_hora;
	}


	public String getAlimentacion() {
		return alimentacion;
	}


	public void setAlimentacion(String alimentacion) {
		this.alimentacion = alimentacion;
	}


	public String getHabitad() {
		return habitad;
	}


	public void setHabitad(String habitad) {
		this.habitad = habitad;
	}


	public String getObservacion() {
		return observacion;
	}


	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}


	public colaborador getId_colaborador() {
		return id_colaborador;
	}


	public void setId_colaborador(colaborador id_colaborador) {
		this.id_colaborador = id_colaborador;
	}


	public historiaClinica getId_historia_clinica() {
		return id_historia_clinica;
	}


	public void setId_historia_clinica(historiaClinica id_historia_clinica) {
		this.id_historia_clinica = id_historia_clinica;
	}
	
	
	
	

}
