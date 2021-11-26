package com.ceiba.reserva.puerto.repositorio;

import com.ceiba.reserva.modelo.entidad.Reserva;

import java.time.LocalDate;

public interface RepositorioReserva {

    /**
     * Permite crear una reserva
     * @param reserva
     * @return el id generado
     */

    Long crear(Reserva reserva);

    /**
     * Permite validar si existe un glamping con ese id
     * @param idGlamping
     * @return si existe o no
     */

    boolean existeGlamping(Long idGlamping);

    /**
     * Permite eliminar una reserva
     * @param id
     */
    void eliminar(Long id);

    /**
     * Permite validar si existe una reserva a esa glamping
     * @param idGlamping,fechaEntrada,fechaSalida
     * @return si existe o no
     */

    boolean existeReserva(Long idGlamping, LocalDate fechaEntrada,LocalDate fechaSalida);



}
