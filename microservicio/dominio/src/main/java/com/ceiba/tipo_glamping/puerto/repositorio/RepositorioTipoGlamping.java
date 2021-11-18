package com.ceiba.tipo_glamping.puerto.repositorio;

import com.ceiba.tipo_glamping.modelo.entidad.TipoGlamping;


public interface RepositorioTipoGlamping {

    /**
     * Permite crear un tipo de glamping
     * @param tipoGlamping
     * @return el id generado
     */
    Long crear(TipoGlamping tipoGlamping);



}
