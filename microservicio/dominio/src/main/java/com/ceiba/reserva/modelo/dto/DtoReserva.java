package com.ceiba.reserva.modelo.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Getter
@AllArgsConstructor
public class DtoReserva {
    private Long id;
    private Long idGlamping;
    private String cedula;
    private String nombre;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;
    private int cantPersonas;
    private String telefono;
    private Double costoTotal;
    private LocalDateTime fechaRegistro;

}

