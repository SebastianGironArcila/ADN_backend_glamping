package com.ceiba.reserva.servicio;

import com.ceiba.BasePrueba;
import com.ceiba.dominio.excepcion.ExcepcionValorInvalido;
import com.ceiba.glamping.modelo.dto.DtoGlamping;
import com.ceiba.glamping.servicio.testdatabuilder.GlampingTestDataBuilder;
import com.ceiba.reserva.modelo.entidad.Reserva;
import com.ceiba.reserva.puerto.dao.DaoReserva;
import com.ceiba.reserva.puerto.repositorio.RepositorioReserva;
import com.ceiba.reserva.servicio.testdatabuilder.ReservaTestDataBuilder;
import com.ceiba.tipo.modelo.dto.DtoTipo;
import com.ceiba.tipo.servicio.testdatabuilder.TipoGlampingTestDataBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.mockito.Mockito;

import java.time.LocalDate;


public class ServicioCrearReservaTest {

    @Test
    @DisplayName("Deberia crear la reserva de manera correcta")
    void deberiaCrearLaReservaDeManeraCorrecta(){
        //arrange
        Reserva reserva = new ReservaTestDataBuilder().conId(1L).build();
        DtoGlamping dtoGlamping = new GlampingTestDataBuilder().buildDt();
        DtoTipo dtoTipo = new TipoGlampingTestDataBuilder().buildDt();
        RepositorioReserva repositorioReserva = Mockito.mock(RepositorioReserva.class);
        DaoReserva daoReserva = Mockito.mock(DaoReserva.class);
        ServicioGenerarReserva servicioGenerarReserva = Mockito.mock(ServicioGenerarReserva.class);

        Mockito.when(repositorioReserva.crear(reserva)).thenReturn(10L);
        Mockito.when(repositorioReserva.existeGlamping(Mockito.anyLong())).thenReturn(true);
        Mockito.when(daoReserva.retonarGlampingPorId(1L)).thenReturn(dtoGlamping);
        Mockito.when(daoReserva.retonarElTipoDeGlampingPorId(1L)).thenReturn(dtoTipo);
        Mockito.when(repositorioReserva.existeReserva(1L, LocalDate.now(),LocalDate.now().plusDays(3))).thenReturn(false);
        Mockito.when(servicioGenerarReserva.ejecutar(reserva)).thenReturn(reserva);
        Mockito.when(repositorioReserva.crear(reserva)).thenReturn(1L);
        ServicioCrearReserva servicioCrearReserva = new ServicioCrearReserva(repositorioReserva,daoReserva,servicioGenerarReserva);
        //act
        servicioCrearReserva.ejecutar(reserva);
        //assert
        Mockito.verify(repositorioReserva,Mockito.times(1)).existeGlamping(1L);
        Mockito.verify(daoReserva,Mockito.times(1)).retonarGlampingPorId(1L);
        Mockito.verify(daoReserva,Mockito.times(1)).retonarElTipoDeGlampingPorId(1L);
        Mockito.verify(repositorioReserva,Mockito.times(1)).existeReserva(1L, LocalDate.now(),LocalDate.now().plusDays(3));
        Mockito.verify(repositorioReserva,Mockito.times(1)).crear(reserva);


    }

    @Test
    @DisplayName("Deberia lanzar una excepcion cuando no exista ese glamping")
    void deberiaLanzarUnaExcepcionCuandoNoExistaEseGlamping(){
        //arrange
        Reserva reserva = new ReservaTestDataBuilder().conId(1L).build();
        DtoGlamping dtoGlamping = new GlampingTestDataBuilder().buildDt();
        DtoTipo dtoTipo = new TipoGlampingTestDataBuilder().buildDt();
        RepositorioReserva repositorioReserva = Mockito.mock(RepositorioReserva.class);
        DaoReserva daoReserva = Mockito.mock(DaoReserva.class);
        ServicioGenerarReserva servicioGenerarReserva = Mockito.mock(ServicioGenerarReserva.class);

        Mockito.when(repositorioReserva.crear(reserva)).thenReturn(10L);
        Mockito.when(repositorioReserva.existeGlamping(5L)).thenReturn(true);
        Mockito.when(daoReserva.retonarGlampingPorId(1L)).thenReturn(dtoGlamping);
        Mockito.when(daoReserva.retonarElTipoDeGlampingPorId(1L)).thenReturn(dtoTipo);
        Mockito.when(servicioGenerarReserva.ejecutar(reserva)).thenReturn(reserva);
        Mockito.when(repositorioReserva.crear(reserva)).thenReturn(1L);
        ServicioCrearReserva servicioCrearReserva = new ServicioCrearReserva(repositorioReserva,daoReserva,servicioGenerarReserva);
        //act
        // assert
        BasePrueba.assertThrows(() -> servicioCrearReserva.ejecutar(reserva), ExcepcionValorInvalido.class,"El glamping no esta registrado en el sistema");


    }

    @Test
    @DisplayName("Deberia lanzar una excepcion cuando la cantidad de personas excedae el limite")
    void deberiaLanzarUnaExcepcionCuandoLaCantidadDePersonasExcedaElLimite(){
        //arrange
        Reserva reserva = new ReservaTestDataBuilder().conId(1L).conCantPersonas(5).build();
        DtoGlamping dtoGlamping = new GlampingTestDataBuilder().buildDt();
        DtoTipo dtoTipo = new TipoGlampingTestDataBuilder().conCantPersonasMax(4L).buildDt();
        RepositorioReserva repositorioReserva = Mockito.mock(RepositorioReserva.class);
        DaoReserva daoReserva = Mockito.mock(DaoReserva.class);
        ServicioGenerarReserva servicioGenerarReserva = Mockito.mock(ServicioGenerarReserva.class);

        Mockito.when(repositorioReserva.crear(reserva)).thenReturn(10L);
        Mockito.when(repositorioReserva.existeGlamping(Mockito.anyLong())).thenReturn(true);
        Mockito.when(daoReserva.retonarGlampingPorId(1L)).thenReturn(dtoGlamping);
        Mockito.when(daoReserva.retonarElTipoDeGlampingPorId(1L)).thenReturn(dtoTipo);
        Mockito.when(servicioGenerarReserva.ejecutar(reserva)).thenReturn(reserva);
        Mockito.when(repositorioReserva.crear(reserva)).thenReturn(1L);
        ServicioCrearReserva servicioCrearReserva = new ServicioCrearReserva(repositorioReserva,daoReserva,servicioGenerarReserva);
        //act-assert
        BasePrueba.assertThrows(() -> servicioCrearReserva.ejecutar(reserva), ExcepcionValorInvalido.class,"La cantidad de personas no puede superar el permitido por el glamping");


    }

    @Test
    @DisplayName("Deberia lanzar una excepcion cuando el glamping ya este reservado")
    void deberiaLanzarUnaExcepcionCuandoElGlampingEsteReservado(){

        //arrange
        Reserva reserva = new ReservaTestDataBuilder().conId(1L).build();
        DtoGlamping dtoGlamping = new GlampingTestDataBuilder().buildDt();
        DtoTipo dtoTipo = new TipoGlampingTestDataBuilder().buildDt();
        RepositorioReserva repositorioReserva = Mockito.mock(RepositorioReserva.class);
        DaoReserva daoReserva = Mockito.mock(DaoReserva.class);
        ServicioGenerarReserva servicioGenerarReserva = Mockito.mock(ServicioGenerarReserva.class);

        Mockito.when(repositorioReserva.crear(reserva)).thenReturn(10L);
        Mockito.when(repositorioReserva.existeGlamping(Mockito.anyLong())).thenReturn(true);
        Mockito.when(daoReserva.retonarGlampingPorId(1L)).thenReturn(dtoGlamping);
        Mockito.when(daoReserva.retonarElTipoDeGlampingPorId(1L)).thenReturn(dtoTipo);
        Mockito.when(repositorioReserva.existeReserva(1L,reserva.getFechaEntrada(),reserva.getFechaSalida())).thenReturn(true);
        ServicioCrearReserva servicioCrearReserva = new ServicioCrearReserva(repositorioReserva,daoReserva,servicioGenerarReserva);
        //act
        //assert
        BasePrueba.assertThrows(() -> servicioCrearReserva.ejecutar(reserva), ExcepcionValorInvalido.class,"Existen reservas para ese glamping durante esos dias");




    }

}
