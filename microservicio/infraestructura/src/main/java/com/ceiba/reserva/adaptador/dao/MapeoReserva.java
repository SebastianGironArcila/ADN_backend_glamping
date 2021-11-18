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
        Long idGlamping = resultSet.getLong("idGlamping");
        String cedula = resultSet.getString("cedula");
        String nombre = resultSet.getString("nombre");
        LocalDate fechaEntrada = extraerLocalDate(resultSet,"fechaEntrada");
        LocalDate fechaSalida = extraerLocalDate(resultSet,"fechaSalida");
        int cantPersonas = resultSet.getInt("cantPersonas");
        String telefono = resultSet.getString("telefono");
        Double costoTotal = resultSet.getDouble("costoTotal");
        LocalDateTime fechaRegistro = extraerLocalDateTime(resultSet,"fechaRegistro");

        return new DtoReserva(id,idGlamping,cedula,nombre,fechaEntrada,fechaSalida,cantPersonas,telefono,costoTotal,fechaRegistro);



    }
}
