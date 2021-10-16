package com.veterinaria.rest;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.veterinaria.model.historiaClinica;
import com.veterinaria.service.historiaClinicaService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping ("/historiaClinica")
public class historiaClinicaRest {
	
	@Autowired
	private historiaClinicaService historiaClinicaService;
	
	@GetMapping
	private ResponseEntity<List<historiaClinica>> getHistoria(){
		
		return ResponseEntity.ok(historiaClinicaService.findAll());
	}
	
	@PostMapping
	private ResponseEntity<historiaClinica> saveHistoria(@RequestBody historiaClinica historiaClinica){
		
		try {
			
			historiaClinica saveHistoria = historiaClinicaService.save(historiaClinica);
			return ResponseEntity.created(new URI("/historiaClinica/"+saveHistoria.getId())).body(saveHistoria);
			
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@DeleteMapping (value = "delete/{id}")
	private ResponseEntity<Boolean> deleteHistoria (@PathVariable ("id") Long id){
		historiaClinicaService.deleteById(id);
		
		return ResponseEntity.ok(!(historiaClinicaService.findById(id)!= null));
	}

}
