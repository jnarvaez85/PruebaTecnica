/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.media.tita.controller;

import com.media.tita.implement.BancoClientesService;
import com.media.tita.modelo.BancoClientes;
import com.media.tita.repository.BancoClientesRepository;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Jairo Narvaez Noel
 */
@RestController
@RequestMapping("/prueba")
@Slf4j
public class ControllerClientes {

    @Autowired
    private BancoClientesService bancoClientesService;

    @Autowired
    private BancoClientesRepository bancoClientesRepository;

    
    
    // Listar todos los Bancos con sus respectivos clientes asociados
    @GetMapping("/listarBancos")
    public List<BancoClientes> listarBancos() {
        return (List<BancoClientes>) bancoClientesService.listarBancos();
    }


    
    
    // Consultar los Bancos Asociados por el numero de documento
    @GetMapping("/bancoClientes/{documento}")
    public List<BancoClientes> bancoClientes(@PathVariable("documento") String documento) {        
        return (List<BancoClientes>) bancoClientesService.listarBancosPorPersonas(documento);
    }

}
