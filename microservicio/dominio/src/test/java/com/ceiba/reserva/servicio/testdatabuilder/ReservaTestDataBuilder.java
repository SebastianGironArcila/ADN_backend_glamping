package com.ceiba.reserva.servicio.testdatabuilder;

import com.ceiba.reserva.modelo.entidad.Reserva;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ReservaTestDataBuilder {
    private Long id;
    private Long id_glamping;
    private String cedula;
    private String nombre;
    private LocalDate fecha_entrada;
    private LocalDate fecha_salida;
    private int cant_personas;
    private String telefono;
    private double costoTotal;
    private LocalDateTime fecha_registro;

    public ReservaTestDataBuilder() {

        id_glamping = Long.valueOf(1);
        cedula = "1116275325";
        nombre = "Duvan";
        fecha_entrada = LocalDate.now();
        fecha_salida =  LocalDate.now().plusDays(3);
        cant_personas = 2;
        telefono = "3198755856";
        costoTotal = Double.valueOf(9894444);
        fecha_registro = LocalDateTime.now();

    }

    public ReservaTestDataBuilder conId(Long id){
        this.id = id;
        return this;
    }

    public ReservaTestDataBuilder conIdGlamping(Long id_glamping) {
        this.id_glamping = id_glamping;
        return this;

    }

    public ReservaTestDataBuilder conCedula(String cedula) {
        this.cedula = cedula;
        return this;

    }

    public ReservaTestDataBuilder conNombre(String nombre) {
        this.nombre = nombre;
        return this;

    }

    public ReservaTestDataBuilder conFechaEntrada(LocalDate fecha_entrada){
        this.fecha_entrada= fecha_entrada;
        return this;

    }

    public ReservaTestDataBuilder conFechaSalida(LocalDate fecha_salida){
        this.fecha_salida= fecha_salida;
        return this;

    }

    public ReservaTestDataBuilder conCantPersonas(int cant_personas){
        this.cant_personas= cant_personas;
        return this;

    }

    public ReservaTestDataBuilder conTelefono(String telefono){
        this.telefono= telefono;
        return this;

    }

    public ReservaTestDataBuilder conCostoTotal(double costoTotal){
        this.costoTotal= costoTotal;
        return this;

    }

    public ReservaTestDataBuilder conFechaRegistro(LocalDateTime fecha_registro){
        this.fecha_registro= fecha_registro;
        return this;

    }

    public Reserva build(){
        return new Reserva(id,id_glamping,cedula,nombre,fecha_entrada,fecha_salida,cant_personas,telefono,costoTotal,fecha_registro);
    }
}
