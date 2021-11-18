package com.ceiba.glamping.servicio.testdatabuilder;

import com.ceiba.glamping.modelo.dto.DtoGlamping;
import com.ceiba.glamping.modelo.entidad.Glamping;

import java.util.UUID;

public class GlampingTestDataBuilder {

    private Long id;
    private Long idtipo_glamping;
    private String descripcion;
    private Double precio;
    private int estado;

    public GlampingTestDataBuilder(){
        idtipo_glamping = 1L;
        descripcion = UUID.randomUUID().toString();
        precio =100000.0;
        estado = 0;

    }

    public GlampingTestDataBuilder conId(Long id){
        this.id = id;
        return this;

    }

    public GlampingTestDataBuilder conIdTipoGlamping(Long idtipo_glamping){
        this.idtipo_glamping = idtipo_glamping;
        return this;

    }

    public GlampingTestDataBuilder conDescripcion(String descripcion){
        this.descripcion = descripcion;
        return this;
    }

    public GlampingTestDataBuilder conPrecio(Double precio){
        this.precio = precio;
        return this;
    }

    public GlampingTestDataBuilder conEstado(int estado){
        this.estado = estado;
        return this;
    }

    public Glamping build(){
        return new Glamping(id,idtipo_glamping,descripcion,precio,estado);
    }

    public DtoGlamping buildDt(){
        return new DtoGlamping(id,idtipo_glamping,descripcion,precio,estado);
    }




}
