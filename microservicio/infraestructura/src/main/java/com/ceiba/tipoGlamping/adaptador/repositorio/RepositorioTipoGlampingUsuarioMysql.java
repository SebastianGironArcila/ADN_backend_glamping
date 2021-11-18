package com.ceiba.tipoGlamping.adaptador.repositorio;


import com.ceiba.infraestructura.jdbc.CustomNamedParameterJdbcTemplate;
import com.ceiba.infraestructura.jdbc.sqlstatement.SqlStatement;
import com.ceiba.tipoGlamping.modelo.entidad.TipoGlamping;
import com.ceiba.tipoGlamping.puerto.repositorio.RepositorioTipoGlamping;
import org.springframework.stereotype.Repository;

@Repository
public class RepositorioTipoGlampingUsuarioMysql implements RepositorioTipoGlamping {

    private final CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate;

    @SqlStatement(namespace="tipoGlamping", value="crear")
    private static String sqlCrear;



    public RepositorioTipoGlampingUsuarioMysql(CustomNamedParameterJdbcTemplate customNamedParameterJdbcTemplate){
        this.customNamedParameterJdbcTemplate = customNamedParameterJdbcTemplate;
    }

    @Override
    public Long crear(TipoGlamping tipoGlamping){
        return this.customNamedParameterJdbcTemplate.crear(tipoGlamping,sqlCrear);
    }

}
