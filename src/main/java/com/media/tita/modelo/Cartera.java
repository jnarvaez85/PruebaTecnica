/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.media.tita.modelo;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 *
 * @author Jairo Narvaez Noel - jaironarvaez8589@gmail.com
 */
@Entity
@Data
@Table(name = "cartera")

@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(name = "SP_PAGAR_CUOTA_DEUDA",
            procedureName = "SP_PAGAR_CUOTA_DEUDA",
            parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "V_COD_CARTERA", type = int.class),
                @StoredProcedureParameter(mode = ParameterMode.IN, name = "V_NUM_CUOTA_PAGADA", type = int.class)
            })
})
public class Cartera implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cod_cartera;

    @NotNull
    @Column
    private int cod_obligacion;

    @NotNull
    @Column
    private int cod_banco;

    @NotNull
    @Column
    private int cod_cliente;

    @NotNull
    @Column
    private int abonos;

    @NotNull
    @Column
    private int total_cuotas;

    @NotNull
    @Column
    private int num_cuota_pagada;

    @NotNull
    @Column
    private int total_deuda;

    @NotNull
    @Column
    private int estado_cuenta;

}
