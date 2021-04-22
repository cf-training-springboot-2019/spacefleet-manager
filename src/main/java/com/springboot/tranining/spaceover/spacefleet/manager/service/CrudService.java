package com.springboot.tranining.spaceover.spacefleet.manager.service;

import java.util.List;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CrudService<T> {

	Page<T> findAll(Example<T> entitySample, Pageable pageRequest);

	List<T> findAll();

	T findBydId(Long id);

	T save(T item);

	T update(T item);

	void deleteById(Long id);

}