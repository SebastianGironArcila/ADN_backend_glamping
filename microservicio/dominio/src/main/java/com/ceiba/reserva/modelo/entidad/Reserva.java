package com.ceiba.reserva.modelo.entidad;


import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static com.ceiba.dominio.ValidadorArgumento.*;


@Getter
public class Reserva {

    private static final String SE_DEBE_INGRESAR_EL_ID_GLAMPING = "Se debe ingresar un identificador de un glamping";
    private static final String SE_DEBE_INGRESAR_LA_CEDULA = "Se debe ingresar la cedula";
    private static final String SE_DEBE_INGRESAR_EL_NOMBRE = "Se debe ingresar el nombre";
    private static final String SE_DEBE_INGRESAR_LA_FECHA_DE_ENTRADA = "Se debe ingresar la fecha de entrada";
    private static final String SE_DEBE_INGRESAR_LA_FECHA_DE_SALIDA = "Se debe ingresar la fecha de salida";
    private static final String SE_DEBE_INGRESAR_LA_CANTIDAD_DE_PERSONAS = "Se debe ingresar la cantidad de personas";
    private static final String SE_DEBE_INGRESAR_EL_TELEFONO = "Se debe ingresar el numero telefonico";
    private static final String SE_DEBE_INGRESAR_EL_COSTO_TOTAL = "Se debe ingresar el costo total";
    private static final String SE_DEBE_INGRESAR_LA_FECHA_DE_REGISTRO = "Se debe ingresar la fecha de registro";
    private static final String FORMATO_FECHA = "yyyy-MM-dd";
    private static final String LA_FECHA_ES_INVALIDA = "Formato de fecha no valido, debe tener la estructura YYYY-MM-DD";


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

    public Reserva(Long id, Long id_glamping, String cedula, String nombre, LocalDate fecha_entrada, LocalDate fecha_salida, int cant_personas, String telefono, Double costoTotal,LocalDateTime fecha_registro) {

        validarObligatorio(id_glamping,SE_DEBE_INGRESAR_EL_ID_GLAMPING);
        validarObligatorio(cedula,SE_DEBE_INGRESAR_LA_CEDULA);
        validarObligatorio(nombre, SE_DEBE_INGRESAR_EL_NOMBRE);
        validarObligatorio(fecha_entrada,SE_DEBE_INGRESAR_LA_FECHA_DE_ENTRADA);
        validarObligatorio(fecha_salida,SE_DEBE_INGRESAR_LA_FECHA_DE_SALIDA);
        validarPositivo((double) cant_personas,SE_DEBE_INGRESAR_LA_CANTIDAD_DE_PERSONAS);
        validarObligatorio(telefono,SE_DEBE_INGRESAR_EL_TELEFONO);
        validarPositivo(costoTotal,SE_DEBE_INGRESAR_EL_COSTO_TOTAL);
        validarObligatorio(fecha_registro,SE_DEBE_INGRESAR_LA_FECHA_DE_REGISTRO);


        this.id = id;
        this.id_glamping = id_glamping;
        this.cedula = cedula;
        this.nombre = nombre;
        this.fecha_entrada = fecha_entrada;
        this.fecha_salida = fecha_salida;
        this.cant_personas = cant_personas;
        this.telefono = telefono;
        this.costoTotal = costoTotal;
        this.fecha_registro = fecha_registro;
    }


}
