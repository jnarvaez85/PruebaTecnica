/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.media.tita.modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
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
