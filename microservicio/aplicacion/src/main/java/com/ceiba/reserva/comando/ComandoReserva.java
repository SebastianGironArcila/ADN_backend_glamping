package com.ceiba.reserva.comando;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ComandoReserva {

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
