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

import com.veterinaria.model.usuario;
import com.veterinaria.service.usuarioService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping ("/usuario")
public class usuarioRest {
	
	@Autowired
	private usuarioService usuarioService;

	
	@GetMapping
	private ResponseEntity<List<usuario>> getAllUsuario(){
		
		return ResponseEntity.ok(usuarioService.findAll());
		
	}
	
	@PostMapping
	private ResponseEntity<usuario> saveUsuario(@RequestBody usuario usuario){
		
		try {
			
			usuario usuarioSave = usuarioService.save(usuario);
			return ResponseEntity.created(new URI("/usuario/"+ usuarioSave.getId())).body(usuarioSave);
			
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
		
	}
	
	
}
