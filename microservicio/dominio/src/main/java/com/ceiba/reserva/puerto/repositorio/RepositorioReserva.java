package com.ceiba.reserva.puerto.repositorio;

import com.ceiba.glamping.modelo.dto.DtoGlamping;
import com.ceiba.glamping.modelo.entidad.Glamping;
import com.ceiba.reserva.modelo.entidad.Reserva;

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


}
