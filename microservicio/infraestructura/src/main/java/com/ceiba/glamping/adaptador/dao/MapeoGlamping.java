package com.ceiba.glamping.adaptador.dao;

import com.ceiba.glamping.modelo.dto.DtoGlamping;
import com.ceiba.infraestructura.jdbc.MapperResult;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MapeoGlamping implements RowMapper<DtoGlamping>, MapperResult {

    @Override
    public DtoGlamping mapRow(ResultSet resultSet, int  rowNum) throws SQLException {

        Long id = resultSet.getLong("id");
        Long idtipo_glamping = resultSet.getLong("idtipo_glamping");
        String descripcion = resultSet.getString("descripcion");
        Double precio = resultSet.getDouble("precio");
        int estado = resultSet.getInt("estado");

        return new DtoGlamping(id,idtipo_glamping,descripcion,precio,estado);
    }
}
