package com.ceiba.tipoGlamping.consulta;


import com.ceiba.tipoGlamping.modelo.dto.DtoTipoGlamping;
import com.ceiba.tipoGlamping.puerto.dao.DaoTipoGlamping;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ManejadorListarTipoGlamping {

    private final DaoTipoGlamping daoTipoGlamping;

    public ManejadorListarTipoGlamping(DaoTipoGlamping daoTipoGlamping){this.daoTipoGlamping=daoTipoGlamping;}

    public List<DtoTipoGlamping> ejecutar(){ return this.daoTipoGlamping.listar(); }
}
