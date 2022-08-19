/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.media.tita.service;

import com.media.tita.implement.BancoClientesService;
import com.media.tita.modelo.BancoClientes;
import com.media.tita.repository.BancoClientesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jairo Narvaez Noel
 */
@Service
public class BancoClientesServiceImplement implements BancoClientesService {

    @Autowired
    BancoClientesRepository bancoClientesRepository;
   

    @Override
    public List<BancoClientes> listarBancos() {
        return (List<BancoClientes>) bancoClientesRepository.findAll();
    }

    @Override
    public List<BancoClientes> listarBancosPorPersonas(String documento) {
        return (List<BancoClientes>) bancoClientesRepository.consultarBancoCliente(documento);
    }
 

}
