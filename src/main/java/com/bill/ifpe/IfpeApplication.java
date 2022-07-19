package com.bill.ifpe;

import com.bill.ifpe.model.Prato;
import com.bill.ifpe.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@SpringBootApplication
public class IfpeApplication {

	public static User currentUser = null;

	public static String teste = "a";
    public static Prato pratoAtual = null;

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("web2");
	private EntityManager entityManager = emf.createEntityManager();

	public static void main(String[] args) {

		SpringApplication.run(IfpeApplication.class, args);
	}

}