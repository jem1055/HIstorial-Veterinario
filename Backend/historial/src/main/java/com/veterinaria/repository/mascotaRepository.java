package com.veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.veterinaria.model.mascota;

public interface mascotaRepository extends JpaRepository<mascota, Long> {

}
