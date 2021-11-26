package com.ceiba.TCRM.client;
import javax.xml.rpc.ServiceException;
import java.net.URL;

public interface TCRMServicesWebService extends javax.xml.rpc.Service
{
	TCRMServicesInterface getTCRMServicesWebServicePort() throws ServiceException;

	TCRMServicesInterface getTCRMServicesWebServicePort(URL portAddress) throws ServiceException;
}
