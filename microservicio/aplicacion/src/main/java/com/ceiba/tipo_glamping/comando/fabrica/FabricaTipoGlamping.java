package com.ceiba.tipo_glamping.comando.fabrica;

import com.ceiba.tipo_glamping.modelo.entidad.TipoGlamping;
import com.ceiba.tipo_glamping.comando.ComandoTipoGlamping;
import org.springframework.stereotype.Component;

@Component
public class FabricaTipoGlamping {

    public TipoGlamping crear(ComandoTipoGlamping comandoTipoGlamping){
        return new TipoGlamping(
                comandoTipoGlamping.getId(),
                comandoTipoGlamping.getTipo(),
                comandoTipoGlamping.getCant_personas_max()

        );
    }
}
