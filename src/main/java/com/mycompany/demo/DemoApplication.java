/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.demo;




import com.mycompany.demo.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


/**
 *
 * @author Krunoslav
 */
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        System.out.println("Hello World!");
    }
    
    @Bean
    public CommandLineRunner demoData(UserRepository repository) {
        return args -> {
            // Ovo će spremiti korisnika čim se aplikacija upali
            // repository.save(new User("Krunoslav", "kruno@email.com"));
            System.out.println("Korisnik je spremljen u bazu!");
        };
    }    
}
