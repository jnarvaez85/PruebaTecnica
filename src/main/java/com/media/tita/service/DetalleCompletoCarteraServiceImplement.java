/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.media.tita.service;

import com.media.tita.implement.DetalleCompletoCarteraService;
import com.media.tita.modelo.DetalleCompletoCartera;
import com.media.tita.repository.DetalleCompletoCarteraRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jairo Narvaez Noel - jaironarvaez8589@gmail.com
 */
@Service
public class DetalleCompletoCarteraServiceImplement implements DetalleCompletoCarteraService {

    @Autowired
    DetalleCompletoCarteraRepository detalleCompletoCarteraRepository;

    @Override
    public List<DetalleCompletoCartera> mostrarDetalleCompletoCartera(int codCartera) {
        return (List<DetalleCompletoCartera>) 
                detalleCompletoCarteraRepository.consultarDetalleCompletoCartera(codCartera);
    }

}
