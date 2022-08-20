/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.media.tita.controller;

import com.media.tita.implement.*;
import com.media.tita.modelo.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Jairo Narvaez Noel
 */
@RestController
@RequestMapping("/clientes")
public class ControllerClientes {

    @Autowired
    private BancoClientesService bancoClientesService;

    @Autowired
    private CarteraPendienteService carteraPendienteService;

    @Autowired
    private DetalleCompletoCarteraService detalleCompletoCarteraService;
    
    @Autowired
    ClientesService clientesService;
    
    
    

    // Mostramos el listado de todos los clientes
    @GetMapping("/mostrarClientes")
    public List<Clientes> mostrarClientes() {
        return (List<Clientes>) clientesService.listarClientes();
    }

    // Debe permitir al usuario ver el listado de sus bancos
    @GetMapping("/bancoClientes/{documento}")
    public List<BancoClientes> bancoClientes(@PathVariable("documento") String documento) {
        return (List<BancoClientes>) bancoClientesService.listarBancosPorPersonas(documento);
    }

    // El sistema debe permitir al usuario seleccionar un Banco y mostrar las deudas que posee en ese banco.
    @GetMapping("/carteraPendiente/{documento}/{codigoBanco}")
    public List<CarteraPendiente> carteraPendiente(
            @PathVariable("documento") String documento,
            @PathVariable("codigoBanco") int codigoBanco
    ) {
        return (List<CarteraPendiente>) carteraPendienteService.mostrarCarteraPendiente(documento, codigoBanco);
    }

    
    // El sistema debe permitir al usuario seleccionar una deuda y mostrar cuánto ha pagado, cuando cuotas debe, cuanto es el dinero total que debe.
    @GetMapping("/detalleCartera/{codCartera}")
    public List<DetalleCompletoCartera> detalleCompletoCartera(@PathVariable("codCartera") int codCartera) {
        return (List<DetalleCompletoCartera>) 
                detalleCompletoCarteraService.mostrarDetalleCompletoCartera(codCartera);
    }

}
