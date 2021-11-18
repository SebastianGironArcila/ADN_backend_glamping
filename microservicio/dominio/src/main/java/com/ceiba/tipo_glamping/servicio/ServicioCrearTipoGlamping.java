package com.ceiba.tipo_glamping.servicio;

import com.ceiba.tipo_glamping.modelo.entidad.TipoGlamping;
import com.ceiba.tipo_glamping.puerto.repositorio.RepositorioTipoGlamping;

public class ServicioCrearTipoGlamping {

    private final RepositorioTipoGlamping repositorioTipoGlamping;

    public ServicioCrearTipoGlamping(RepositorioTipoGlamping repositorioTipoGlamping){
        this.repositorioTipoGlamping = repositorioTipoGlamping;
    }

    public Long ejecutar(TipoGlamping tipoGlamping){
        return this.repositorioTipoGlamping.crear(tipoGlamping);

    }



}
