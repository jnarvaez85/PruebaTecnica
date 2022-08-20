/*
* CHALLENGE BACKEND - PRUEBA TECNICA
* SISTEMA INTEGRADO DE GESTION
* Empresa: TITA MEDIA
* Desarrollador Backend: Jairo Narvaez
* Fecha: Agosto, 2022
*/

package com.media.tita.implement;

import com.media.tita.modelo.CarteraPendiente;
import java.util.List;

/**
 *
 * @author Jairo Narvaez Noel - jaironarvaez8589@gmail.com
 */
public interface CarteraPendienteService {
    
    public List<CarteraPendiente> mostrarCarteraPendiente(String documento, int codigoBanco);
    
}
