/*
* CHALLENGE BACKEND - PRUEBA TECNICA
* SISTEMA INTEGRADO DE GESTION
* Empresa: TITA MEDIA
* Desarrollador Backend: Jairo Narvaez
* Fecha: Agosto, 2022
*/

package com.media.tita.repository;

import com.media.tita.modelo.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Jairo Narvaez Noel - jaironarvaez8589@gmail.com
 */
public interface ClientesRepository extends JpaRepository<Clientes, Integer>{
    
}
