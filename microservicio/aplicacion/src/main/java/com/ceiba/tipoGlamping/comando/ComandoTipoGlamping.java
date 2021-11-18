package com.ceiba.tipoGlamping.comando;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ComandoTipoGlamping {

    private Long id;
    private String tipo;
    private Long cantPersonasMax;


}
