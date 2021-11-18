package com.ceiba.tipo_glamping.adaptador.dao;

import com.ceiba.infraestructura.jdbc.MapperResult;
import com.ceiba.tipo_glamping.modelo.dto.DtoTipoGlamping;
import org.springframework.jdbc.core.RowMapper;


import java.sql.ResultSet;
import java.sql.SQLException;

public class MapeoTipoGlamping implements RowMapper<DtoTipoGlamping>, MapperResult {

    @Override
    public DtoTipoGlamping mapRow(ResultSet resultSet, int rowNum) throws SQLException{
        Long id = resultSet.getLong("id");
        String tipo = resultSet.getString("tipo");
        Long cant_personas_max = resultSet.getLong("cant_personas_max");

        return new DtoTipoGlamping(id,tipo,cant_personas_max);

    }
}
