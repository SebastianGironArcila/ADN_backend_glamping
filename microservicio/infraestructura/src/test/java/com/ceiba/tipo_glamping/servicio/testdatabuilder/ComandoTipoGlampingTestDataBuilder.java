package com.ceiba.tipo_glamping.servicio.testdatabuilder;

import com.ceiba.tipo_glamping.comando.ComandoTipoGlamping;

import java.util.UUID;

public class ComandoTipoGlampingTestDataBuilder {

    private Long id;
    private String tipo;
    private Long cant_personas_max;

    public ComandoTipoGlampingTestDataBuilder(){
        tipo = "pareja";
        cant_personas_max = Long.valueOf(4);


    }

    public ComandoTipoGlampingTestDataBuilder conTipo(Long idTipoGlamping){
        this.id = idTipoGlamping;
        return this;
    }



    public ComandoTipoGlampingTestDataBuilder conCantPersonasMax(Long cant_personas_max){
        this.cant_personas_max = cant_personas_max;
        return this;
    }

    public ComandoTipoGlamping build(){
        return new ComandoTipoGlamping(id,tipo,cant_personas_max);
    }


}
