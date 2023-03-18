package com.smd.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.smd.entity.Financer;

@Repository
public interface FinancerRepository extends CrudRepository<Financer, Long> {

}
