package com.ceiba.tipo.adaptador.dao;


import com.ceiba.infraestructura.jdbc.CustomNamedParameterJdbcTemplate;
import com.ceiba.infraestructura.jdbc.sqlstatement.SqlStatement;
import com.ceiba.tipo.modelo.dto.DtoTipoGlamping;
import com.ceiba.tipo.puerto.dao.DaoTipoGlamping;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DaoTipoGlampingMysql implements DaoTipoGlamping {

    private final CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate;

    @SqlStatement(namespace="tipoGlamping", value="listar")
    private static String sqlListar;

    public DaoTipoGlampingMysql(CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate) {
        this.customNamedParameterJdbcTemplate = customNamedParameterJdbcTemplate;
    }

    @Override
    public List<DtoTipoGlamping> listar(){
        return this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().query(sqlListar, new MapeoTipoGlamping());
    }
}
