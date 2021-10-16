package com.veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.veterinaria.model.usuario;

public interface usuarioRepository extends JpaRepository<usuario, Long> {

}
