/*
* CHALLENGE BACKEND - PRUEBA TECNICA
* SISTEMA INTEGRADO DE GESTION
* Empresa: TITA MEDIA
* Desarrollador Backend: Jairo Narvaez
* Fecha: Agosto, 2022
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
