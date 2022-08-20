/*
* CHALLENGE BACKEND - PRUEBA TECNICA
* SISTEMA INTEGRADO DE GESTION
* Empresa: TITA MEDIA
* Desarrollador Backend: Jairo Narvaez
* Fecha: Agosto, 2022
*/

package com.media.tita.modelo;

import java.io.Serializable;;
import javax.persistence.*;
import javax.validation.constraints.*;
import lombok.Data;

/**
 *
 * @author Jairo Narvaez Noel
 */
@Entity
@Data
@Table(name = "view_clientes_banco")
public class BancoClientes implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cod_cartera;
    
    @NotNull
    private int cod_cliente;
    
    @NotEmpty
    private String nombre_cliente;
    
    @NotEmpty
    private String documento_cliente;
    
    @NotEmpty
    private String nombre_banco;
    
    @NotNull
    private int cod_banco;

}
