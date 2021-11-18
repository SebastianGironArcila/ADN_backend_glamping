package com.ceiba.tipo_glamping.adaptador.dao;


import com.ceiba.infraestructura.jdbc.CustomNamedParameterJdbcTemplate;
import com.ceiba.infraestructura.jdbc.sqlstatement.SqlStatement;
import com.ceiba.tipo_glamping.modelo.dto.DtoTipoGlamping;
import com.ceiba.tipo_glamping.puerto.dao.DaoTipoGlamping;
import com.ceiba.usuario.adaptador.dao.MapeoUsuario;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DaoTipoGlampingMysql implements DaoTipoGlamping {

    private final CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate;

    @SqlStatement(namespace="tipo_glamping", value="listar")
    private static String sqlListar;

    public DaoTipoGlampingMysql(CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate) {
        this.customNamedParameterJdbcTemplate = customNamedParameterJdbcTemplate;
    }

    @Override
    public List<DtoTipoGlamping> listar(){
        return this.customNamedParameterJdbcTemplate.getNamedParameterJdbcTemplate().query(sqlListar, new MapeoTipoGlamping());
    }
}
