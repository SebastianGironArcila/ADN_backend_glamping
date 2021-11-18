package com.ceiba.reserva.servicio.testdatabuilder;

import com.ceiba.glamping.servicio.testdatabuilder.ComandoGlampingTestDataBuilder;
import com.ceiba.reserva.comando.ComandoReserva;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ComandoReservaTestDataBuilder {

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

   public ComandoReservaTestDataBuilder() {
      id_glamping = Long.valueOf(1);
      cedula = "1116275325";
      nombre = "Sergio Reyes";
      fecha_entrada = LocalDate.now();
      fecha_salida =  LocalDate.now().plusDays(3);
      cant_personas = 2;
      telefono = "3198755856";
      costoTotal = Double.valueOf(9894444);
      fecha_registro = LocalDateTime.now();

   }

   public ComandoReservaTestDataBuilder conIdGlamping(Long id_glamping) {
      this.id_glamping = id_glamping;
      return this;

   }

   public ComandoReservaTestDataBuilder conCedula(String cedula) {
      this.cedula = cedula;
      return this;

   }

   public ComandoReservaTestDataBuilder conNombre(String nombre) {
      this.nombre = nombre;
      return this;

   }

   public ComandoReservaTestDataBuilder conFechaEntrada(LocalDate fecha_entrada){
      this.fecha_entrada= fecha_entrada;
      return this;

   }

   public ComandoReservaTestDataBuilder conFechaSalida(LocalDate fecha_salida){
      this.fecha_salida= fecha_salida;
      return this;

   }

   public ComandoReservaTestDataBuilder conCantPersonas(int cant_personas){
      this.cant_personas= cant_personas;
      return this;

   }

   public ComandoReservaTestDataBuilder conTelefono(String telefono){
      this.telefono= telefono;
      return this;

   }

   public ComandoReservaTestDataBuilder conCostoTotal(Double costoTotal){
      this.costoTotal= costoTotal;
      return this;

   }

   public ComandoReservaTestDataBuilder conFechaRegistro(LocalDateTime localDateTime){
      this.fecha_registro= fecha_registro;
      return this;

   }

   public ComandoReserva build(){
      return new ComandoReserva(id,id_glamping,cedula,nombre,fecha_entrada,fecha_salida,cant_personas,telefono,costoTotal,fecha_registro);
   }

}
