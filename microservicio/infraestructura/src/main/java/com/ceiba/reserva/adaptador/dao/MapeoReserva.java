package com.ceiba.reserva.adaptador.dao;

import com.ceiba.infraestructura.jdbc.MapperResult;
import com.ceiba.reserva.modelo.dto.DtoReserva;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;


public class MapeoReserva implements RowMapper<DtoReserva>, MapperResult  {

    @Override
    public DtoReserva mapRow(ResultSet resultSet, int  rowNum) throws SQLException {
        Long id = resultSet.getLong("id");
        Long id_glamping = resultSet.getLong("id_glamping");
        String cedula = resultSet.getString("cedula");
        String nombre = resultSet.getString("nombre");
        LocalDate fecha_entrada = extraerLocalDate(resultSet,"fecha_entrada");
        LocalDate fecha_salida = extraerLocalDate(resultSet,"fecha_salida");
        int cant_personas = resultSet.getInt("cant_personas");
        String telefono = resultSet.getString("telefono");
        Double costoTotal = resultSet.getDouble("costoTotal");
        LocalDateTime fecha_registro = extraerLocalDateTime(resultSet,"fecha_registro");

        return new DtoReserva(id,id_glamping,cedula,nombre,fecha_entrada,fecha_salida,cant_personas,telefono,costoTotal,fecha_registro);



    }
}
