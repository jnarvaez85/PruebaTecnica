/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.media.tita.repository;

import com.media.tita.modelo.BancoClientes;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Jairo Narvaez Noel
 */
public interface CarteraPendienteRepository extends JpaRepository<BancoClientes, Integer>{
    
}
