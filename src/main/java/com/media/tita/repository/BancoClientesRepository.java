/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.media.tita.repository;

import com.media.tita.modelo.BancoClientes;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Jairo Narvaez Noel
 */
public interface BancoClientesRepository extends JpaRepository<BancoClientes, Integer> {

  
    
  
    @Query(value = "SELECT * FROM view_clientes_banco u WHERE u.documento_cliente = :documento",
            nativeQuery = true
    )    
    List<BancoClientes>  consultarBancoCliente(@Param("documento") String documento);    
    
    
        
}
