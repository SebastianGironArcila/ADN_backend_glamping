package com.ceiba.reserva.comando;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ComandoReserva {

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
