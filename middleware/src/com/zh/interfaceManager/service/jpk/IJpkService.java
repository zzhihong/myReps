package com.zh.interfaceManager.service.jpk;

import com.zh.interfaceManager.client.jpk.JpkResult;
import com.zh.interfaceManager.client.jpk.Ticket_entrance;

public interface IJpkService {
	public JpkResult getCheckTicketWebService(Ticket_entrance jpk);

}
