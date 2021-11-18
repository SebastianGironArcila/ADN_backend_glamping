package com.ceiba.reserva.servicio;

import com.ceiba.glamping.modelo.dto.DtoGlamping;
import com.ceiba.glamping.servicio.testdatabuilder.GlampingTestDataBuilder;
import com.ceiba.reserva.modelo.entidad.Reserva;
import com.ceiba.reserva.puerto.dao.DaoReserva;
import com.ceiba.reserva.servicio.testdatabuilder.ReservaTestDataBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicioGenerarReservaTest {

    @Test
    @DisplayName("Deberia generar la reserva de manera correcta con un descuento del 20%")
    void deberiaGenerarReservaDeManeraCorrectaConDescuento(){
        //Arrange
        DtoGlamping dtoGlamping = new GlampingTestDataBuilder().conPrecio(250000.0).buildDt();
        Reserva reserva = new ReservaTestDataBuilder().conId(1L).conFechaRegistro(LocalDateTime.of(2021,11,18,8,30,00)).build();
        DaoReserva daoReserva = Mockito.mock(DaoReserva.class);
        ServicioGenerarReserva servicioGenerarReserva = new ServicioGenerarReserva(daoReserva);
        Mockito.when(daoReserva.retonarGlampingPorId(Mockito.anyLong())).thenReturn(dtoGlamping);
        //Act
        Reserva reservaGenerada = servicioGenerarReserva.ejecutar(reserva);
        //Assert
        assertEquals(200000.0,reservaGenerada.getCostoTotal());


    }

    @Test
    @DisplayName("Deberia generar la reserva de manera correcta con un aumento del 35%")
    void deberiaGenerarReservaDeManeraCorrectaConAumento(){
        //Arrange
        DtoGlamping dtoGlamping = new GlampingTestDataBuilder().conPrecio(250000.0).buildDt();
        Reserva reserva = new ReservaTestDataBuilder().conId(1L).conFechaRegistro(LocalDateTime.of(2021,11,19,8,30,00)).build();
        DaoReserva daoReserva = Mockito.mock(DaoReserva.class);
        ServicioGenerarReserva servicioGenerarReserva = new ServicioGenerarReserva(daoReserva);
        Mockito.when(daoReserva.retonarGlampingPorId(Mockito.anyLong())).thenReturn(dtoGlamping);
        //Act
        Reserva reservaGenerada = servicioGenerarReserva.ejecutar(reserva);
        //Assert
        assertEquals(337500.0,reservaGenerada.getCostoTotal());


    }



}
