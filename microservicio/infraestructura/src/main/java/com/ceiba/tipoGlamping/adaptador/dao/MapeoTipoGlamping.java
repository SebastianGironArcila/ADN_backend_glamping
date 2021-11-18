package com.ceiba.tipoGlamping.adaptador.dao;

import com.ceiba.infraestructura.jdbc.MapperResult;
import com.ceiba.tipoGlamping.modelo.dto.DtoTipoGlamping;
import org.springframework.jdbc.core.RowMapper;


import java.sql.ResultSet;
import java.sql.SQLException;

public class MapeoTipoGlamping implements RowMapper<DtoTipoGlamping>, MapperResult {

    @Override
    public DtoTipoGlamping mapRow(ResultSet resultSet, int rowNum) throws SQLException{
        Long id = resultSet.getLong("id");
        String tipo = resultSet.getString("tipo");
        Long cantPersonasMax = resultSet.getLong("cantPersonasMax");

        return new DtoTipoGlamping(id,tipo, cantPersonasMax);

    }
}
