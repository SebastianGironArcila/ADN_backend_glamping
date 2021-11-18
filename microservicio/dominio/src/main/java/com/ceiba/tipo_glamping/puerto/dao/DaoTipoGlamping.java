package com.ceiba.tipo_glamping.puerto.dao;

import com.ceiba.tipo_glamping.modelo.dto.DtoTipoGlamping;

import java.util.List;

public interface DaoTipoGlamping {

    /**
     *
     * permite listar los tipos de glamping
     * @return los tipos de glamping
     */

    List<DtoTipoGlamping> listar();
}
