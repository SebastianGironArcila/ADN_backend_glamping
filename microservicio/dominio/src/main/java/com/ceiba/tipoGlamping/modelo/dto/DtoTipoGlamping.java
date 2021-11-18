package com.ceiba.tipoGlamping.modelo.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class DtoTipoGlamping {

    private Long id;
    private String tipo;
    private Long cantPersonasMax;
}
