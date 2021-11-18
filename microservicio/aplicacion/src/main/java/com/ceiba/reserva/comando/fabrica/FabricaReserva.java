package com.ceiba.reserva.comando.fabrica;


import com.ceiba.reserva.comando.ComandoReserva;
import com.ceiba.reserva.modelo.entidad.Reserva;
import org.springframework.stereotype.Component;

@Component
public class FabricaReserva {

    public Reserva crear(ComandoReserva comandoReserva){
        return new Reserva(
                comandoReserva.getId(),
                comandoReserva.getId_glamping(),
                comandoReserva.getCedula(),
                comandoReserva.getNombre(),
                comandoReserva.getFecha_entrada(),
                comandoReserva.getFecha_salida(),
                comandoReserva.getCant_personas(),
                comandoReserva.getTelefono(),
                comandoReserva.getCostoTotal(),
                comandoReserva.getFecha_registro()



        );
    }
}
