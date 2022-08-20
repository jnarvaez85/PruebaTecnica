/*
* CHALLENGE BACKEND - PRUEBA TECNICA
* SISTEMA INTEGRADO DE GESTION
* Empresa: TITA MEDIA
* Desarrollador Backend: Jairo Narvaez
* Fecha: Agosto, 2022
*/

package com.media.tita.repository;

import com.media.tita.modelo.CarteraPendiente;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Jairo Narvaez Noel - jaironarvaez8589@gmail.com
 */
public interface CarteraPendienteRepository extends JpaRepository<CarteraPendiente, Integer>{
    
@Query(value = "SELECT * FROM view_cartera_pendiente u "
        + "WHERE u.documento_cliente = :documento AND u.codigo_banco = :codigoBanco",
            nativeQuery = true
)    
    List<CarteraPendiente>  consultarCarteraPendiente(
            @Param("documento") String documento,
            @Param("codigoBanco") int codigoBanco
    ); 
    
}
