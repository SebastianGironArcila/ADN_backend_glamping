package com.ceiba.tipo.servicio.testdatabuilder;

import com.ceiba.tipo.modelo.dto.DtoTipo;
import com.ceiba.tipo.modelo.entidad.Tipo;

public class TipoGlampingTestDataBuilder {

    private Long id;
    private String tipo;
    private Long cantPersonasMax;

    public TipoGlampingTestDataBuilder(){
        tipo = "familiar";
        cantPersonasMax = 4L;


    }



    public TipoGlampingTestDataBuilder conId(Long id){
        this.id=id;
        return this;
    }

    public TipoGlampingTestDataBuilder conTipo(String tipo){
        this.tipo = tipo;
        return this;
    }



    public TipoGlampingTestDataBuilder conCantPersonasMax(Long cantPersonasMax){
        this.cantPersonasMax = cantPersonasMax;
        return this;
    }

    public Tipo build(){
        return new Tipo(id,tipo, cantPersonasMax);
    }

    public DtoTipo buildDt(){ return new DtoTipo(id,tipo, cantPersonasMax); }
}
