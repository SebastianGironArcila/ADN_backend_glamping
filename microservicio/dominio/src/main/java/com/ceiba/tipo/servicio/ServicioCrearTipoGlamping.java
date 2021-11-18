package com.ceiba.tipo.servicio;

import com.ceiba.tipo.modelo.entidad.TipoGlamping;
import com.ceiba.tipo.puerto.repositorio.RepositorioTipoGlamping;

public class ServicioCrearTipoGlamping {

    private final RepositorioTipoGlamping repositorioTipoGlamping;

    public ServicioCrearTipoGlamping(RepositorioTipoGlamping repositorioTipoGlamping){
        this.repositorioTipoGlamping = repositorioTipoGlamping;
    }

    public Long ejecutar(TipoGlamping tipoGlamping){
        return this.repositorioTipoGlamping.crear(tipoGlamping);

    }



}
