/*
* CHALLENGE BACKEND - PRUEBA TECNICA
* SISTEMA INTEGRADO DE GESTION
* Empresa: TITA MEDIA
* Desarrollador Backend: Jairo Narvaez
* Fecha: Agosto, 2022
*/

package com.media.tita.service;

import com.media.tita.implement.ClientesService;
import com.media.tita.modelo.Clientes;
import com.media.tita.repository.ClientesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jairo Narvaez Noel - jaironarvaez8589@gmail.com
 */

@Service
public class ClientesServiceImplement implements ClientesService{

    @Autowired
    ClientesRepository clientesRepository;
    
    @Override
    public List<Clientes> listarClientes() {
        return (List<Clientes>) clientesRepository.findAll();
    }
    
}
