package com.ceiba.reserva.servicio;

import com.ceiba.dominio.excepcion.ExcepcionValorInvalido;
import com.ceiba.glamping.modelo.dto.DtoGlamping;
import com.ceiba.reserva.modelo.entidad.Reserva;
import com.ceiba.reserva.puerto.dao.DaoReserva;
import com.ceiba.reserva.puerto.repositorio.RepositorioReserva;
import com.ceiba.tipo.modelo.dto.DtoTipo;


public class ServicioCrearReserva {

    private static final String EL_GLAMPING_NO_EXISTE_EN_EL_SISTEMA = "El glamping no esta registrado en el sistema";
    private static final String LA_CANTIDAD_DE_PERSONAS_NO_PUEDE_SUPERAR_EL_LIMITE_DEL_GLAMPING= "La cantidad de personas no puede superar el permitido por el glamping";
    private static final String EXISTEN_RESERVAS_PARA_ESE_GLAMPING_DURANTE_ESOS_DIAS = "Existen reservas para ese glamping durante esos dias";
    private final RepositorioReserva repositorioReserva;
    private final DaoReserva daoReserva;
    private final ServicioGenerarReserva servicioGenerarReserva;



    public ServicioCrearReserva(RepositorioReserva repositorioReserva, DaoReserva daoReserva, ServicioGenerarReserva servicioGenerarReserva){
        this.repositorioReserva = repositorioReserva;
        this.daoReserva = daoReserva;
        this.servicioGenerarReserva = servicioGenerarReserva;
    }

    public Long ejecutar(Reserva reserva){
        validarExistenciaGlamping(reserva);
        validarCantidadDePersonas(reserva);
        validarEstado(reserva);
        reserva = this.servicioGenerarReserva.ejecutar(reserva);
        return this.repositorioReserva.crear(reserva);
    }

    private void validarExistenciaGlamping(Reserva reserva){
        boolean existe= this.repositorioReserva.existeGlamping(reserva.getIdGlamping());
        if(!existe){
            throw new ExcepcionValorInvalido(EL_GLAMPING_NO_EXISTE_EN_EL_SISTEMA);
        }
    }

    private void validarEstado(Reserva reserva){
        boolean existe = this.repositorioReserva.existeReserva(reserva.getIdGlamping(),reserva.getFechaEntrada(),reserva.getFechaSalida());
        if(existe){
            throw new ExcepcionValorInvalido(EXISTEN_RESERVAS_PARA_ESE_GLAMPING_DURANTE_ESOS_DIAS);
        }
    }



    private void validarCantidadDePersonas(Reserva reserva){
        DtoGlamping dtoGlamping = this.daoReserva.retonarGlampingPorId(reserva.getIdGlamping());
        DtoTipo dtoTipo = this.daoReserva.retonarElTipoDeGlampingPorId(dtoGlamping.getIdTipoGlamping());
        if(reserva.getCantPersonas()> dtoTipo.getCantPersonasMax()){
            throw new ExcepcionValorInvalido(LA_CANTIDAD_DE_PERSONAS_NO_PUEDE_SUPERAR_EL_LIMITE_DEL_GLAMPING);
        }

    }








}
