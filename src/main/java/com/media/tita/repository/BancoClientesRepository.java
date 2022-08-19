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

/**
 *
 * @author Jairo Narvaez Noel
 */
public interface BancoClientesRepository extends JpaRepository<BancoClientes, Integer> {

//    
//    @Query("select c from view_clientes_banco c where c.documento_cliente like %?1")
//    List<BancoClientes>  consultarBancoCliente(String documento_cliente);
    
    
    @Query(nativeQuery = true, value = "select * from view_clientes_banco where documento_cliente = :documento")  
    List<BancoClientes>  consultarBancoCliente(String documento);
        
}
