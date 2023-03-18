package com.smd.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.smd.entity.Rate;

@Repository
public interface RateRepository extends CrudRepository<Rate, Long> {

}
