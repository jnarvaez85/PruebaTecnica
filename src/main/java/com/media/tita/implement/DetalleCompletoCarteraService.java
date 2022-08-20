/*
* CHALLENGE BACKEND - PRUEBA TECNICA
* SISTEMA INTEGRADO DE GESTION
* Empresa: TITA MEDIA
* Desarrollador Backend: Jairo Narvaez
* Fecha: Agosto, 2022
*/

package com.media.tita.implement;

import com.media.tita.modelo.DetalleCompletoCartera;
import java.util.List;

/**
 *
 * @author Jairo Narvaez Noel - jaironarvaez8589@gmail.com
 */
public interface DetalleCompletoCarteraService {

    public List<DetalleCompletoCartera> mostrarDetalleCompletoCartera(int codCartera);

}
