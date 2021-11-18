package com.ceiba.reserva.adaptador.repositorio;


import com.ceiba.glamping.adaptador.dao.MapeoGlamping;
import com.ceiba.glamping.modelo.dto.DtoGlamping;
import com.ceiba.glamping.modelo.entidad.Glamping;
import com.ceiba.infraestructura.jdbc.CustomNamedParameterJdbcTemplate;
import com.ceiba.infraestructura.jdbc.sqlstatement.SqlStatement;
import com.ceiba.reserva.modelo.entidad.Reserva;
import com.ceiba.reserva.puerto.repositorio.RepositorioReserva;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

@Repository
public class RepositorioReservaMysql implements RepositorioReserva {

    private CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate;

    @SqlStatement(namespace = "reserva", value = "crear")
    private static String sqlCrear;

    @SqlStatement(namespace = "glamping",value = "existePorId")
    private static String sqlExisteGlamping;


    public RepositorioReservaMysql(CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate) {
        this.customNamedParameterJdbcTemplate = customNamedParameterJdbcTemplate;
    }

    @Override
    public Long crear(Reserva reserva) {
        return this.customNamedParameterJdbcTemplate.crear(reserva,sqlCrear);
    }

    @Override
    public boolean existeGlamping(Long id_glamping) {
        MapSqlParameterSource paramSource = new MapSqlParameterSource();
        paramSource.addValue("id_glamping",id_glamping);
        return this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().queryForObject(sqlExisteGlamping,paramSource,Boolean.class);

    }


}
