package com.ceiba.tipoGlamping.entidad;

import com.ceiba.BasePrueba;
import com.ceiba.dominio.excepcion.ExcepcionValorInvalido;
import com.ceiba.dominio.excepcion.ExcepcionValorObligatorio;
import com.ceiba.tipoGlamping.modelo.entidad.TipoGlamping;
import com.ceiba.tipoGlamping.servicio.testdatabuilder.TipoGlampingTestDataBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TipoGlampingTest {

    @Test
    @DisplayName("Deberia crear correctamente el tipo de glamping")
    void deberiaCrearCorrectamenteElTipoGlamping(){
        //arrange
        //act
        TipoGlamping tipoGlamping = new  TipoGlampingTestDataBuilder().conId(1L).conTipo("familiar").conCantPersonasMax(Long.valueOf(4)).build();
        //aseert
        assertEquals(1,tipoGlamping.getId());
        assertEquals("familiar",tipoGlamping.getTipo());
        assertEquals(4,tipoGlamping.getCantPersonasMax());

    }

    @Test
    void deberiaFallarSinTipo(){
        //arrange
        TipoGlampingTestDataBuilder tipoGlampingTestDataBuilder = new TipoGlampingTestDataBuilder().conTipo(null).conId(1L);
        //act-assert
        BasePrueba.assertThrows(() -> {
                    tipoGlampingTestDataBuilder.build();
                },
                ExcepcionValorObligatorio.class, "Se debe ingresar el tipo de glamping");

    }

    @Test
    void deberiaFallarSinCantPersonas(){
        //arrange
        TipoGlampingTestDataBuilder tipoGlampingTestDataBuilder = new TipoGlampingTestDataBuilder().conCantPersonasMax(null).conId(1L);
        //act-assert
        BasePrueba.assertThrows(() -> {
                    tipoGlampingTestDataBuilder.build();
                },
                ExcepcionValorObligatorio.class, "Se debe ingresar la cantidad de personas maxima");

    }

    @Test
    void deberiaFallarSiNoContieneSoloLetras(){
        //arrange
        TipoGlampingTestDataBuilder tipoGlampingTestDataBuilder = new TipoGlampingTestDataBuilder().conTipo("cabaña/54") .conId(1L);
        //act-assert
        BasePrueba.assertThrows(() -> {
                    tipoGlampingTestDataBuilder.build();
                },
                ExcepcionValorInvalido.class, "El tipo glamping solo puede contener letras");

    }

    @Test
    void deberiaFallarSiElNumeroEsInvalido(){
        //arrange
        TipoGlampingTestDataBuilder tipoGlampingTestDataBuilder = new TipoGlampingTestDataBuilder().conCantPersonasMax(0L).conId(1L);
        //act-assert
        BasePrueba.assertThrows(() -> {
                    tipoGlampingTestDataBuilder.build();
                },
                ExcepcionValorInvalido.class, "La cantidad de personas debe ser un numero entero positivo");

    }





}
