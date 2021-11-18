package com.ceiba.tipo.puerto.dao;

import com.ceiba.tipo.modelo.dto.DtoTipoGlamping;

import java.util.List;

public interface DaoTipoGlamping {

    /**
     *
     * permite listar los tipos de glamping
     * @return los tipos de glamping
     */

    List<DtoTipoGlamping> listar();
}
