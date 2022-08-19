/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
//    @Column(name = "cod_cliente", updatable = false, nullable = false)
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
