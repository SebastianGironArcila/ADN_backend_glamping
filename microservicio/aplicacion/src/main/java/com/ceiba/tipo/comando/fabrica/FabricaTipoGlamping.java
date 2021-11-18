package com.ceiba.tipo.comando.fabrica;

import com.ceiba.tipo.modelo.entidad.TipoGlamping;
import com.ceiba.tipo.comando.ComandoTipoGlamping;
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
