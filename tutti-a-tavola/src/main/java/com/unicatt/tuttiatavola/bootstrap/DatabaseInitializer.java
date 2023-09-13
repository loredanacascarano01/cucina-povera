package com.unicatt.tuttiatavola.bootstrap;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseInitializer implements CommandLineRunner {

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    @Override
    public void run(String... args) throws Exception {
        // Crea il database
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.createNativeQuery("CREATE DATABASE mydatabase").executeUpdate();
        entityManager.getTransaction().commit();

        // Crea le tabelle
        entityManager.getTransaction().begin();
        entityManager.createNativeQuery("CREATE TABLE users (id INT AUTO_INCREMENT, name VARCHAR(255), PRIMARY KEY (id))").executeUpdate();
        entityManager.createNativeQuery("CREATE TABLE posts (id INT AUTO_INCREMENT, title VARCHAR(255), content VARCHAR(255), author_id INT, PRIMARY KEY (id), FOREIGN KEY (author_id) REFERENCES users (id))").executeUpdate();
        entityManager.getTransaction().commit();
    }
}
