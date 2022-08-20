/*
* CHALLENGE BACKEND - PRUEBA TECNICA
* SISTEMA INTEGRADO DE GESTION
* Empresa: TITA MEDIA
* Desarrollador Backend: Jairo Narvaez
* Fecha: Agosto, 2022
*/

package com.media.tita.controller;

import com.media.tita.repository.CarteraReposity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 *
 * @author Jairo Narvaez Noel - jaironarvaez8589@gmail.com
 */
@RestController
@RequestMapping("/clientes")
@Slf4j
public class ControllerOperaciones {

    @Autowired
    CarteraReposity carteraReposity;

//    El sistema debe permitir al usuario pagar una deuda, el usuario podrá indicar 
//    cuantas cuotas quiere pagar o si quiere pagar su deuda en su totalidad.Posteriormente el 
//    sistema debe actualizar para mostrar el nuevo saldo que debe, cuántas cuotas debe o si 
//    la deuda ya fue cancelada.
            
    @PutMapping("/detalleCartera/{codCartera}/{cuotaPagada}")
    public void abonarCuota(
            @PathVariable("codCartera") int codCartera,  
            @PathVariable("cuotaPagada") int cuotaPagada) {        
        
        carteraReposity.pagarCuotaDeuda(codCartera, cuotaPagada);
        log.info("El número de cuotas por actualizar es: "+ cuotaPagada);
    }

}