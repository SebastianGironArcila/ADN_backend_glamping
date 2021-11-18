package com.ceiba.tipo_glamping.modelo.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class DtoTipoGlamping {

    private Long id;
    private String tipo;
    private Long cant_personas_max;
}
