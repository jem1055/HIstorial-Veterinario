package com.veterinaria.rest;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.veterinaria.model.detalleHistoriaClinica;
import com.veterinaria.service.detalleHistoriaClinicaService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping ("/detalleHistoriaClinica")
public class detalleHistoriaClinicaRest {
	
	@Autowired
	private detalleHistoriaClinicaService detalleHistoriaClinicaService;
	
	@GetMapping
	private ResponseEntity<List<detalleHistoriaClinica>> getDetalle(){
		
		return ResponseEntity.ok(detalleHistoriaClinicaService.findAll());
		
	}
	
	@PostMapping
	private ResponseEntity<detalleHistoriaClinica> saveDetalle(@RequestBody detalleHistoriaClinica detalleHistoriaClinica){
		
		try {
			
			detalleHistoriaClinica saveDetalle = detalleHistoriaClinicaService.save(detalleHistoriaClinica);
			return ResponseEntity.created(new URI("/detalleHistoriaClinica/"+saveDetalle.getId())).body(detalleHistoriaClinica);
			
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}

}
