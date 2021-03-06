package com.ceiba.TCRM.controlador;


import com.ceiba.tcrm.servicio.ServicioConsultarTCRM;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tcrm")
@Api(tags = {"Controlador consulta tcrm"})
public class ConsultaControladorTCRM {

    @Autowired
    private ServicioConsultarTCRM servicioConsultarTCRM;




    @GetMapping
    @ApiOperation("Consultar el TCRM del dia")
    public Float consultarValor(){
        return servicioConsultarTCRM.ejecutar();
    }
}
