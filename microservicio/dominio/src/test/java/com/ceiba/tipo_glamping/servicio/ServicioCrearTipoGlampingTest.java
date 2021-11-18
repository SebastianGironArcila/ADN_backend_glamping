package com.ceiba.tipo_glamping.servicio;

import com.ceiba.BasePrueba;
import com.ceiba.dominio.excepcion.ExcepcionLongitudValor;
import com.ceiba.tipo_glamping.modelo.entidad.TipoGlamping;
import com.ceiba.tipo_glamping.puerto.repositorio.RepositorioTipoGlamping;
import com.ceiba.tipo_glamping.servicio.testdatabuilder.TipoGlampingTestDataBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServicioCrearTipoGlampingTest {


    @Test
    @DisplayName("Deberia crear el tipo de glamping de manera correcta")
    void deberiaCrearElTipoGlampingDeManeraCorrecta(){

        TipoGlamping tipoGlamping = new TipoGlampingTestDataBuilder().build();
        RepositorioTipoGlamping repositorioTipoGlamping = Mockito.mock(RepositorioTipoGlamping.class);
        Mockito.when(repositorioTipoGlamping.crear(tipoGlamping)).thenReturn(10L);
        ServicioCrearTipoGlamping servicioCrearTipoGlamping = new ServicioCrearTipoGlamping(repositorioTipoGlamping);
        //act
        Long idTipoGlamping = servicioCrearTipoGlamping.ejecutar(tipoGlamping);
        //assert
        assertEquals(10L,idTipoGlamping);
        Mockito.verify(repositorioTipoGlamping, Mockito.times(1)).crear(tipoGlamping);


    }




}
