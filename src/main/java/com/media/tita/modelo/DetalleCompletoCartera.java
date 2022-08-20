/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
 * @author Jairo Narvaez Noel - jaironarvaez8589@gmail.com
 */
@Entity
@Data
@Table(name = "view_cartera")
public class DetalleCompletoCartera implements Serializable {

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
    
    @NotNull
    private int codigo_banco;
    
    @NotEmpty
    private String nombre_banco;
    
    @NotEmpty
    private String referencia_obligacion;
    
    @NotNull
    private int total_deuda;
    
    @NotNull
    private int total_cuotas;
    
    @NotNull
    private int cuota_mensual;
    
    @NotNull
    private int abonos;
    
    @NotNull
    private int num_cuota_pagada;
    
    @NotNull
    private int cuotas_faltantes;
    
    @NotNull
    private int saldo_pendiente;
    
    @NotEmpty
    private String estado_cuenta;

}
