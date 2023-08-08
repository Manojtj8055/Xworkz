package com.Xworz.Interrface.app.airport;

public class BangloreAirportRule implements AirportRule{
	
	@Override
public void getTicket() {
		System.out.println("Ticket should be booked");
	}
	
	@Override
	public void getPassPort() {
		System.out.println("Passport should be taken");
		}

}
