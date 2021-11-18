package com.ceiba.tipo_glamping.modelo.entidad;


import lombok.Getter;

import static com.ceiba.dominio.ValidadorArgumento.validarObligatorio;
import static com.ceiba.dominio.ValidadorArgumento.validarPositivo;
import static com.ceiba.dominio.ValidadorArgumento.validarSoloLetras;
import static com.ceiba.dominio.ValidadorArgumento.validarNoVacio;


@Getter
public class TipoGlamping {


    private static final String SE_DEBE_INGRESAR_EL_TIPO_DE_GLAMPING = "Se debe ingresar el tipo de glamping";
    private static final String SE_DEBE_INGRESAR_LA_CANTIDAD_DE_PERSONAS_MAXIMA = "Se debe ingresar la cantidad de personas maxima";
    private static final String LA_CANTIDAD_DE_PERSONAS_DEBE_SER_UN_NUMERO_POSITIVO = "La cantidad de personas debe ser un numero entero positivo";
    private static final String EL_TIPO_GLAMPING_DEBE_SER_TEXTO = "El tipo glamping solo puede contener letras";



    private Long id;
    private String tipo;
    private Long cant_personas_max;

    public TipoGlamping(Long id, String tipo, Long cant_personas_max) {
        validarObligatorio(tipo,SE_DEBE_INGRESAR_EL_TIPO_DE_GLAMPING);
        validarObligatorio(cant_personas_max,SE_DEBE_INGRESAR_LA_CANTIDAD_DE_PERSONAS_MAXIMA);

        validarSoloLetras(tipo,EL_TIPO_GLAMPING_DEBE_SER_TEXTO);
        validarPositivo(Double.valueOf(cant_personas_max),LA_CANTIDAD_DE_PERSONAS_DEBE_SER_UN_NUMERO_POSITIVO);


        this.id = id;
        this.tipo = tipo;
        this.cant_personas_max = cant_personas_max;
    }
}
