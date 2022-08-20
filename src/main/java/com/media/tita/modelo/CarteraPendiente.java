/*
* CHALLENGE BACKEND - PRUEBA TECNICA
* SISTEMA INTEGRADO DE GESTION
* Empresa: TITA MEDIA
* Desarrollador Backend: Jairo Narvaez
* Fecha: Agosto, 2022
*/

package com.media.tita.modelo;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.*;
import lombok.Data;

/**
 *
 * @author Jairo Narvaez Noel
 */

@Entity
@Data
@Table(name = "view_cartera_pendiente")
public class CarteraPendiente implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cod_cartera;
    
    @NotEmpty
    private String documento_cliente;
    
    @NotNull
    private int codigo_banco;
    
    @NotEmpty
    private String nombre_banco; 
    
    @NotEmpty
    private String referencia_obligacion;
    
    @NotNull
    private int cod_obligacion;
    
    @NotNull
    private Double total_deuda; 
    
    @NotEmpty
    private String estado_cuenta;
    
}
