package com.ceiba.reserva.servicio;

import com.ceiba.glamping.modelo.dto.DtoGlamping;
import com.ceiba.reserva.modelo.entidad.Reserva;
import com.ceiba.reserva.puerto.dao.DaoReserva;

import java.time.DayOfWeek;

public class ServicioGenerarReserva {

    private final DaoReserva daoReserva;

    public ServicioGenerarReserva(DaoReserva daoReserva){
        this.daoReserva = daoReserva;
    }

    public Reserva ejecutar(Reserva reserva){
        return new Reserva(reserva.getId(),reserva.getId_glamping(),reserva.getCedula(),reserva.getNombre(),reserva.getFecha_entrada(),reserva.getFecha_salida(),reserva.getCant_personas(),reserva.getTelefono()
                ,calcularCostoTotal(reserva),reserva.getFecha_registro());
    }

    private Double calcularCostoTotal(Reserva reserva){
        DtoGlamping dtoGlamping =this.daoReserva.retonarGlampingPorId(reserva.getId_glamping());
        Double costo=dtoGlamping.getPrecio();


        if(reserva.getFecha_registro().getDayOfWeek() == DayOfWeek.TUESDAY ||
                reserva.getFecha_registro().getDayOfWeek() == DayOfWeek.WEDNESDAY ||
                reserva.getFecha_registro().getDayOfWeek() == DayOfWeek.THURSDAY){


            costo  = dtoGlamping.getPrecio() - dtoGlamping.getPrecio()*0.20;

        }else if(reserva.getFecha_registro().getDayOfWeek()== DayOfWeek.FRIDAY ||
                    reserva.getFecha_registro().getDayOfWeek() == DayOfWeek.SATURDAY ||
                    reserva.getFecha_registro().getDayOfWeek() == DayOfWeek.SUNDAY){

            costo  = dtoGlamping.getPrecio() + dtoGlamping.getPrecio()*0.35;
        }

        return costo;



    }


}
