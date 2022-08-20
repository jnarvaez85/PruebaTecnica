/*
* CHALLENGE BACKEND - PRUEBA TECNICA
* SISTEMA INTEGRADO DE GESTION
* Empresa: TITA MEDIA
* Desarrollador Backend: Jairo Narvaez
* Fecha: Agosto, 2022
*/

package com.media.tita.repository;

import com.media.tita.modelo.Cartera;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author Jairo Narvaez Noel - jaironarvaez8589@gmail.com
 */
public interface CarteraReposity extends JpaRepository<Cartera, Integer> {

    @Procedure(name = "SP_PAGAR_CUOTA_DEUDA")
    void pagarCuotaDeuda(
            @PathVariable("V_COD_CARTERA") int V_COD_CARTERA,
            @PathVariable("V_NUM_CUOTA_PAGADA") int V_NUM_CUOTA_PAGADA
            
    );

}
