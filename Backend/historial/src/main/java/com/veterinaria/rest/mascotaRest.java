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

import com.veterinaria.model.mascota;
import com.veterinaria.service.mascotaService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping ("/mascota")
public class mascotaRest {
	
	@Autowired
	private mascotaService mascotaService;
	
	@GetMapping
	private ResponseEntity<List<mascota>> getAllMascotas(){
		
		return ResponseEntity.ok(mascotaService.findAll());
	}
	
	@PostMapping
	private ResponseEntity<mascota> saveMascota(@RequestBody mascota mascota){
		
		try {
			
			mascota saveMascota = mascotaService.save(mascota);
			return ResponseEntity.created(new URI("/mascota/"+saveMascota.getId())).body(saveMascota);
			
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}

}
