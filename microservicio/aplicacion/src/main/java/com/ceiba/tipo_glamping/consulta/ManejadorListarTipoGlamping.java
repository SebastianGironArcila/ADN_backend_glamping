package com.ceiba.tipo_glamping.consulta;


import com.ceiba.tipo_glamping.modelo.dto.DtoTipoGlamping;
import com.ceiba.tipo_glamping.puerto.dao.DaoTipoGlamping;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ManejadorListarTipoGlamping {

    private final DaoTipoGlamping daoTipoGlamping;

    public ManejadorListarTipoGlamping(DaoTipoGlamping daoTipoGlamping){this.daoTipoGlamping=daoTipoGlamping;}

    public List<DtoTipoGlamping> ejecutar(){ return this.daoTipoGlamping.listar(); }
}
