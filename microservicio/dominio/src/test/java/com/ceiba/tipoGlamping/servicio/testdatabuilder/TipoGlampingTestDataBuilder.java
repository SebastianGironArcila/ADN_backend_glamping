package com.ceiba.tipoGlamping.servicio.testdatabuilder;

import com.ceiba.tipoGlamping.modelo.dto.DtoTipoGlamping;
import com.ceiba.tipoGlamping.modelo.entidad.TipoGlamping;

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

    public TipoGlamping build(){
        return new TipoGlamping(id,tipo, cantPersonasMax);
    }

    public DtoTipoGlamping buildDt(){ return new DtoTipoGlamping(id,tipo, cantPersonasMax); }
}
