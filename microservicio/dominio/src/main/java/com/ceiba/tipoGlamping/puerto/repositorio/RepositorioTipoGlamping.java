package com.ceiba.tipoGlamping.puerto.repositorio;

import com.ceiba.tipoGlamping.modelo.entidad.TipoGlamping;


public interface RepositorioTipoGlamping {

    /**
     * Permite crear un tipo de glamping
     * @param tipoGlamping
     * @return el id generado
     */
    Long crear(TipoGlamping tipoGlamping);



}
