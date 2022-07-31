package com.ifpe.edu.br.web2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@SpringBootApplication
public class Web2Application {

//    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("web2");
//    private EntityManager entityManager = emf.createEntityManager();

    public static void main(String[] args) {
        SpringApplication.run(Web2Application.class, args);
    }

}
