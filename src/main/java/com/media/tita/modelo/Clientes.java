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
import javax.validation.constraints.NotEmpty;
import lombok.Data;

/**
 *
 * @author Jairo Narvaez Noel - jaironarvaez8589@gmail.com
 */
@Entity
@Data
@Table(name = "clientes")
public class Clientes implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cod_cliente;

    @NotEmpty
    private String documento_cliente;
    
    @NotEmpty
    private String nombre_cliente;
    
    @NotEmpty
    private String apellidos_cliente;

}
