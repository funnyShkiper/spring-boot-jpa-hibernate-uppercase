package com.test.demo.repository;

import com.test.demo.entity.Applicants;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicantsRepository extends CrudRepository<Applicants, Long> {
}
