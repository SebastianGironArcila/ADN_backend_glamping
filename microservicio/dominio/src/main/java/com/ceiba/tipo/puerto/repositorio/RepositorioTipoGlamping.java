package com.ceiba.tipo.puerto.repositorio;

import com.ceiba.tipo.modelo.entidad.TipoGlamping;


public interface RepositorioTipoGlamping {

    /**
     * Permite crear un tipo de glamping
     * @param tipoGlamping
     * @return el id generado
     */
    Long crear(TipoGlamping tipoGlamping);



}
