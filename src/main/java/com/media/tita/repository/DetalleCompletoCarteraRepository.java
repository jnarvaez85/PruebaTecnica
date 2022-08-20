/*
* CHALLENGE BACKEND - PRUEBA TECNICA
* SISTEMA INTEGRADO DE GESTION
* Empresa: TITA MEDIA
* Desarrollador Backend: Jairo Narvaez
* Fecha: Agosto, 2022
*/

package com.media.tita.repository;

import com.media.tita.modelo.DetalleCompletoCartera;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Jairo Narvaez Noel - jaironarvaez8589@gmail.com
 */
public interface DetalleCompletoCarteraRepository extends JpaRepository<DetalleCompletoCartera, Integer>{
    
    @Query(value = "SELECT * FROM view_cartera u WHERE u.cod_cartera = :codCartera",
            nativeQuery = true
)    
    List<DetalleCompletoCartera>  consultarDetalleCompletoCartera(@Param("codCartera") int codCartera);
    
}
