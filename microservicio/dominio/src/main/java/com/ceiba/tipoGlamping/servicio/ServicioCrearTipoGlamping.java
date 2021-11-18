package com.ceiba.tipoGlamping.servicio;

import com.ceiba.tipoGlamping.modelo.entidad.TipoGlamping;
import com.ceiba.tipoGlamping.puerto.repositorio.RepositorioTipoGlamping;

public class ServicioCrearTipoGlamping {

    private final RepositorioTipoGlamping repositorioTipoGlamping;

    public ServicioCrearTipoGlamping(RepositorioTipoGlamping repositorioTipoGlamping){
        this.repositorioTipoGlamping = repositorioTipoGlamping;
    }

    public Long ejecutar(TipoGlamping tipoGlamping){
        return this.repositorioTipoGlamping.crear(tipoGlamping);

    }



}
