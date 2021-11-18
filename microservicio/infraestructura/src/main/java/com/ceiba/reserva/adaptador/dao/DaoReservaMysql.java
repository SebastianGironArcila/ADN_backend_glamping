package com.ceiba.reserva.adaptador.dao;


import com.ceiba.glamping.adaptador.dao.MapeoGlamping;
import com.ceiba.glamping.modelo.dto.DtoGlamping;
import com.ceiba.infraestructura.jdbc.CustomNamedParameterJdbcTemplate;
import com.ceiba.infraestructura.jdbc.sqlstatement.SqlStatement;
import com.ceiba.reserva.modelo.dto.DtoReserva;
import com.ceiba.reserva.puerto.dao.DaoReserva;
import com.ceiba.tipo_glamping.adaptador.dao.MapeoTipoGlamping;
import com.ceiba.tipo_glamping.modelo.dto.DtoTipoGlamping;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DaoReservaMysql implements DaoReserva {

    private final CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate;

    @SqlStatement(namespace = "reserva", value = "listar")
    private static String sqlListar;


    @SqlStatement(namespace = "glamping",value = "obtenerPorId")
    private static String sqlObtenerPorId;

    @SqlStatement(namespace = "tipo_glamping",value = "obtenerPorId")
    private static String sqlObtenerPorIdTG;


    public DaoReservaMysql(CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate) {
        this.customNamedParameterJdbcTemplate = customNamedParameterJdbcTemplate;
    }

    @Override
    public List<DtoReserva> listar() {
        return this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().query(sqlListar,new MapeoReserva());
    }

    @Override
    public DtoGlamping retonarGlampingPorId(Long id_glamping) {
        MapSqlParameterSource paramSource = new MapSqlParameterSource();
        paramSource.addValue("id_glamping",id_glamping);
        return this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().queryForObject(sqlObtenerPorId,paramSource,new MapeoGlamping());

    }

    @Override
    public DtoTipoGlamping retonarElTipoDeGlampingPorId(Long id_tipo_glamping) {

        MapSqlParameterSource paramSource = new MapSqlParameterSource();
        paramSource.addValue("id_tipo_glamping",id_tipo_glamping);
        return this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().queryForObject(sqlObtenerPorIdTG,paramSource,new MapeoTipoGlamping());

    }
}
