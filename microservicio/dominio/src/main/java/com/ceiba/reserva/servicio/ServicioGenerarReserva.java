package com.ceiba.reserva.servicio;

import com.ceiba.glamping.modelo.dto.DtoGlamping;
import com.ceiba.reserva.modelo.entidad.Reserva;
import com.ceiba.reserva.puerto.dao.DaoReserva;

import java.time.DayOfWeek;

public class ServicioGenerarReserva {

    public static final double PORCENTAJE_DESCUENTO = 0.20;
    public static final double PORCENTAJE_AUMENTO = 0.35;
    private final DaoReserva daoReserva;

    public ServicioGenerarReserva(DaoReserva daoReserva){
        this.daoReserva = daoReserva;
    }

    public Reserva ejecutar(Reserva reserva){
        return new Reserva(reserva.getId(),reserva.getCedula(),reserva.getNombre(),reserva.getFechaEntrada(),reserva.getIdGlamping(),reserva.getCantPersonas(),reserva.getTelefono(),
                reserva.getFechaSalida(),calcularCostoTotal(reserva),reserva.getFechaRegistro());
    }

    private Double calcularCostoTotal(Reserva reserva){
        DtoGlamping dtoGlamping =this.daoReserva.retonarGlampingPorId(reserva.getIdGlamping());
        Double costo=dtoGlamping.getPrecio();


        if(reserva.getFechaRegistro().getDayOfWeek() == DayOfWeek.TUESDAY ||
                reserva.getFechaRegistro().getDayOfWeek() == DayOfWeek.WEDNESDAY ||
                reserva.getFechaRegistro().getDayOfWeek() == DayOfWeek.THURSDAY){


            costo  = dtoGlamping.getPrecio() - dtoGlamping.getPrecio()* PORCENTAJE_DESCUENTO;

        }else if(reserva.getFechaRegistro().getDayOfWeek()== DayOfWeek.FRIDAY ||
                    reserva.getFechaRegistro().getDayOfWeek() == DayOfWeek.SATURDAY ||
                    reserva.getFechaRegistro().getDayOfWeek() == DayOfWeek.SUNDAY){

            costo  = dtoGlamping.getPrecio() + dtoGlamping.getPrecio()* PORCENTAJE_AUMENTO;
        }

        return costo;



    }


}
