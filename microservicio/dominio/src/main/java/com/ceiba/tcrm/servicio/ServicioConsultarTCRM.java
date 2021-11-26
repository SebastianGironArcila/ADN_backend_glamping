package com.ceiba.tcrm.servicio;

import com.ceiba.tcrm.puerto.repositorio.IRepositorioTCRM;

import java.util.Calendar;

public class ServicioConsultarTCRM {

    private final IRepositorioTCRM repositorioTCRM;

    public ServicioConsultarTCRM(IRepositorioTCRM repositorioTCRM) {
        this.repositorioTCRM = repositorioTCRM;
    }

    public Float ejecutar(){
        return this.repositorioTCRM.getValue(Calendar.getInstance());
    }
}
