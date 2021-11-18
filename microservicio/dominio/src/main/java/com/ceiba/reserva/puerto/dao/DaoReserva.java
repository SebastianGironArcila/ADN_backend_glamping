package com.ceiba.reserva.puerto.dao;

import com.ceiba.glamping.modelo.dto.DtoGlamping;
import com.ceiba.reserva.modelo.dto.DtoReserva;
import com.ceiba.tipo_glamping.modelo.dto.DtoTipoGlamping;

import java.util.List;

public interface DaoReserva {

    /**
     *
     * permite listar las reservas
     * @return las reservas
     */
    List<DtoReserva> listar();

    /**
     * Permite retornar el glamping
     * @param id_glamping
     * @return glamping
     */

    DtoGlamping retonarGlampingPorId(Long id_glamping);

    /**
     * Permite retornar el tipo de glamping
     * @param id_tipo_glamping
     * @return tipo_glamping
     */

    DtoTipoGlamping retonarElTipoDeGlampingPorId(Long id_tipo_glamping);



}
