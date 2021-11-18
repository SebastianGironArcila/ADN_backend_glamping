package com.ceiba.tipoGlamping.comando.manejador;


import com.ceiba.ComandoRespuesta;
import com.ceiba.manejador.ManejadorComandoRespuesta;
import com.ceiba.tipoGlamping.comando.fabrica.FabricaTipoGlamping;
import com.ceiba.tipoGlamping.modelo.entidad.TipoGlamping;
import com.ceiba.tipoGlamping.servicio.ServicioCrearTipoGlamping;
import com.ceiba.tipoGlamping.comando.ComandoTipoGlamping;
import org.springframework.stereotype.Component;

@Component
public class ManejadorCrearTipoGlamping implements ManejadorComandoRespuesta<ComandoTipoGlamping, ComandoRespuesta<Long>> {

    private final FabricaTipoGlamping fabricaTipoGlamping;
    private final ServicioCrearTipoGlamping servicioCrearTipoGlamping;

    public ManejadorCrearTipoGlamping(FabricaTipoGlamping fabricaTipoGlamping, ServicioCrearTipoGlamping servicioCrearTipoGlamping){
        this.fabricaTipoGlamping = fabricaTipoGlamping;
        this.servicioCrearTipoGlamping = servicioCrearTipoGlamping;

    }

    public ComandoRespuesta<Long> ejecutar(ComandoTipoGlamping comandoTipoGlamping){
        TipoGlamping tipoGlamping = this.fabricaTipoGlamping.crear(comandoTipoGlamping);
        return new ComandoRespuesta<>(this.servicioCrearTipoGlamping.ejecutar(tipoGlamping));


    }



}
