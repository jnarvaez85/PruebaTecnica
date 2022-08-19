/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.media.tita.implement;

import com.media.tita.modelo.BancoClientes;
import java.util.List;

/**
 *
 * @author Jairo Narvaez Noel
 */
public interface BancoClientesService {
    
    public List<BancoClientes> listarBancos();
    
    public List<BancoClientes> listarBancosPorPersonas(String documento);
    
    
    
}
