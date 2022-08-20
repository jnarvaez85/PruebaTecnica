/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
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
