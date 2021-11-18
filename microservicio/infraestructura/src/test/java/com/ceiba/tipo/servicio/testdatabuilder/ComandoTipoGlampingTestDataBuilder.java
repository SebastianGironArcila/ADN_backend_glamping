package com.ceiba.tipo.servicio.testdatabuilder;

import com.ceiba.tipo.comando.ComandoTipoGlamping;

public class ComandoTipoGlampingTestDataBuilder {

    private Long id;
    private String tipo;
    private Long cantPersonasMax;

    public ComandoTipoGlampingTestDataBuilder(){
        tipo = "pareja";
        cantPersonasMax = Long.valueOf(4);


    }

    public ComandoTipoGlampingTestDataBuilder conTipo(Long idTipoGlamping){
        this.id = idTipoGlamping;
        return this;
    }



    public ComandoTipoGlampingTestDataBuilder conCantPersonasMax(Long cantPersonasMax){
        this.cantPersonasMax = cantPersonasMax;
        return this;
    }

    public ComandoTipoGlamping build(){
        return new ComandoTipoGlamping(id,tipo, cantPersonasMax);
    }


}
