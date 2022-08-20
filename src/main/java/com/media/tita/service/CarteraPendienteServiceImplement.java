/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.media.tita.service;

import com.media.tita.implement.CarteraPendienteService;
import com.media.tita.modelo.BancoClientes;
import com.media.tita.modelo.CarteraPendiente;
import com.media.tita.repository.CarteraPendienteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jairo Narvaez Noel - jaironarvaez8589@gmail.com
 */
@Service
public class CarteraPendienteServiceImplement implements CarteraPendienteService {

    @Autowired
    CarteraPendienteRepository carteraPendienteRepository;

    @Override
    public List<CarteraPendiente> mostrarCarteraPendiente(String documento, int codigoBanco) {
        return (List<CarteraPendiente>) carteraPendienteRepository.consultarCarteraPendiente(documento, codigoBanco);
    }

}
