package com.ceiba.tipo_glamping.servicio.testdatabuilder;

import com.ceiba.tipo_glamping.modelo.dto.DtoTipoGlamping;
import com.ceiba.tipo_glamping.modelo.entidad.TipoGlamping;

public class TipoGlampingTestDataBuilder {

    private Long id;
    private String tipo;
    private Long cant_personas_max;

    public TipoGlampingTestDataBuilder(){
        tipo = "familiar";
        cant_personas_max = 4L;


    }



    public TipoGlampingTestDataBuilder conId(Long id){
        this.id=id;
        return this;
    }

    public TipoGlampingTestDataBuilder conTipo(String tipo){
        this.tipo = tipo;
        return this;
    }



    public TipoGlampingTestDataBuilder conCantPersonasMax(Long cant_personas_max){
        this.cant_personas_max = cant_personas_max;
        return this;
    }

    public TipoGlamping build(){
        return new TipoGlamping(id,tipo,cant_personas_max);
    }

    public DtoTipoGlamping buildDt(){ return new DtoTipoGlamping(id,tipo,cant_personas_max); }
}
