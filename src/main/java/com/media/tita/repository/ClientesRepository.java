/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.media.tita.repository;

import com.media.tita.modelo.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Jairo Narvaez Noel - jaironarvaez8589@gmail.com
 */
public interface ClientesRepository extends JpaRepository<Clientes, Integer>{
    
}
