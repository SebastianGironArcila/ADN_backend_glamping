package com.ceiba.reserva.modelo.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Getter
@AllArgsConstructor
public class DtoReserva {
    private Long id;
    private Long id_glamping;
    private String cedula;
    private String nombre;
    private LocalDate fecha_entrada;
    private LocalDate fecha_salida;
    private int cant_personas;
    private String telefono;
    private Double costoTotal;
    private LocalDateTime fecha_registro;

}

