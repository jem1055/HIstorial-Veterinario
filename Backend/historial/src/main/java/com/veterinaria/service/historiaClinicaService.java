package com.veterinaria.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.veterinaria.model.historiaClinica;
import com.veterinaria.repository.historiaClinicaRepository;

@Service
public class historiaClinicaService implements historiaClinicaRepository {
	
	@Autowired
	private historiaClinicaRepository historiaClinicaRepository;

	@Override
	public List<historiaClinica> findAll() {
		return historiaClinicaRepository.findAll();
	}

	@Override
	public List<historiaClinica> findAll(Sort sort) {
		return historiaClinicaRepository.findAll(sort);
	}

	@Override
	public List<historiaClinica> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends historiaClinica> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends historiaClinica> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends historiaClinica> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<historiaClinica> entities) {
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
	public historiaClinica getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public historiaClinica getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends historiaClinica> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends historiaClinica> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<historiaClinica> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends historiaClinica> S save(S entity) {
				return historiaClinicaRepository.save(entity);
	}

	@Override
	public Optional<historiaClinica> findById(Long id) {
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
		historiaClinicaRepository.deleteById(id);		
	}

	@Override
	public void delete(historiaClinica entity) {
		historiaClinicaRepository.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends historiaClinica> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends historiaClinica> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends historiaClinica> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends historiaClinica> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends historiaClinica> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

}
