package com.veterinaria.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.veterinaria.model.detalleHistoriaClinica;
import com.veterinaria.repository.detalleHistoriaClinicaRepository;

@Service
public class detalleHistoriaClinicaService implements detalleHistoriaClinicaRepository {
	
	@Autowired
	private detalleHistoriaClinicaRepository detalleHistoriaClinicaRepository;

	@Override
	public List<detalleHistoriaClinica> findAll() {
		return detalleHistoriaClinicaRepository.findAll();
	}

	@Override
	public List<detalleHistoriaClinica> findAll(Sort sort) {
		return detalleHistoriaClinicaRepository.findAll(sort);
	}

	@Override
	public List<detalleHistoriaClinica> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends detalleHistoriaClinica> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends detalleHistoriaClinica> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends detalleHistoriaClinica> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<detalleHistoriaClinica> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public detalleHistoriaClinica getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public detalleHistoriaClinica getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends detalleHistoriaClinica> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends detalleHistoriaClinica> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<detalleHistoriaClinica> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends detalleHistoriaClinica> S save(S entity) {
		return detalleHistoriaClinicaRepository.save(entity);
	}

	@Override
	public Optional<detalleHistoriaClinica> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		detalleHistoriaClinicaRepository.deleteById(id);		
	}

	@Override
	public void delete(detalleHistoriaClinica entity) {
		detalleHistoriaClinicaRepository.delete(entity);
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends detalleHistoriaClinica> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends detalleHistoriaClinica> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends detalleHistoriaClinica> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends detalleHistoriaClinica> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends detalleHistoriaClinica> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

}
