package com.ceiba.TCRM.adaptador.repositorio;

import com.ceiba.TCRM.client.TCRMServicesInterfaceProxy;
import com.ceiba.TCRM.client.TcrmResponse;
import com.ceiba.tcrm.puerto.repositorio.IRepositorioTCRM;
import org.springframework.stereotype.Repository;


import java.util.Calendar;

@Repository
public class RepositorioTCRM implements IRepositorioTCRM {


    private static final String WEB_SERVICE_URL = "https://www.superfinanciera.gov.co/SuperfinancieraWebServiceTRM/TCRMServicesWebService/TCRMServicesWebService?WSDL";


    @Override
    public Float getValue(Calendar fechaConsultar) {
        try {

            TCRMServicesInterfaceProxy proxy = new TCRMServicesInterfaceProxy(WEB_SERVICE_URL);
            TcrmResponse tcrmResponse = proxy.queryTCRM(fechaConsultar);

            return tcrmResponse.getValue();
        } catch (Exception e) {
            System.out.println("error tcrm " + e.getMessage());
            return null;
        }
    }
}
