package com.divo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.divo.domain.Greenhouse;

public interface GreenhouseRepository extends CrudRepository<Greenhouse, Integer> {

}
