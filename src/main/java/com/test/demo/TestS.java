package com.test.demo;

import com.test.demo.entity.Test;
import com.test.demo.repository.ApplicantsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class TestS implements CommandLineRunner {

    @Autowired
    private ApplicantsRepository applicantsRepository;

    @Override
    public void run(String... args) throws Exception {

        this.applicantsRepository.findAll();

    }
}
