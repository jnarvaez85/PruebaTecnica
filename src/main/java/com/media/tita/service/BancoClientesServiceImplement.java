/*
* CHALLENGE BACKEND - PRUEBA TECNICA
* SISTEMA INTEGRADO DE GESTION
* Empresa: TITA MEDIA
* Desarrollador Backend: Jairo Narvaez
* Fecha: Agosto, 2022
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
