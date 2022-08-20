/*
* CHALLENGE BACKEND - PRUEBA TECNICA
* SISTEMA INTEGRADO DE GESTION
* Empresa: TITA MEDIA
* Desarrollador Backend: Jairo Narvaez
* Fecha: Agosto, 2022
*/

package com.media.tita.service;

import com.media.tita.implement.DetalleCompletoCarteraService;
import com.media.tita.modelo.DetalleCompletoCartera;
import com.media.tita.repository.DetalleCompletoCarteraRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jairo Narvaez Noel - jaironarvaez8589@gmail.com
 */
@Service
public class DetalleCompletoCarteraServiceImplement implements DetalleCompletoCarteraService {

    @Autowired
    DetalleCompletoCarteraRepository detalleCompletoCarteraRepository;

    @Override
    public List<DetalleCompletoCartera> mostrarDetalleCompletoCartera(int codCartera) {
        return (List<DetalleCompletoCartera>) 
                detalleCompletoCarteraRepository.consultarDetalleCompletoCartera(codCartera);
    }

}
