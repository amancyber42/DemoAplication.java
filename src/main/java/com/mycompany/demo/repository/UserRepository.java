/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mycompany.demo.model.User;

/**
 *
 * @author Krunoslav
 */
public interface UserRepository extends JpaRepository<User, Long> {
    
}
