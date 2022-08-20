/*
* CHALLENGE BACKEND - PRUEBA TECNICA
* SISTEMA INTEGRADO DE GESTION
* Empresa: TITA MEDIA
* Desarrollador Backend: Jairo Narvaez
* Fecha: Agosto, 2022
*/

package com.media.tita.service;

import com.media.tita.implement.CarteraPendienteService;
import com.media.tita.modelo.CarteraPendiente;
import com.media.tita.repository.CarteraPendienteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jairo Narvaez Noel - jaironarvaez8589@gmail.com
 */
@Service
public class CarteraPendienteServiceImplement implements CarteraPendienteService {

    @Autowired
    CarteraPendienteRepository carteraPendienteRepository;

    @Override
    public List<CarteraPendiente> mostrarCarteraPendiente(String documento, int codigoBanco) {
        return (List<CarteraPendiente>) carteraPendienteRepository.consultarCarteraPendiente(documento, codigoBanco);
    }

}
