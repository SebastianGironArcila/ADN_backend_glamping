package com.ceiba.tipoGlamping.comando.fabrica;

import com.ceiba.tipoGlamping.modelo.entidad.TipoGlamping;
import com.ceiba.tipoGlamping.comando.ComandoTipoGlamping;
import org.springframework.stereotype.Component;

@Component
public class FabricaTipoGlamping {

    public TipoGlamping crear(ComandoTipoGlamping comandoTipoGlamping){
        return new TipoGlamping(
                comandoTipoGlamping.getId(),
                comandoTipoGlamping.getTipo(),
                comandoTipoGlamping.getCantPersonasMax()

        );
    }
}
