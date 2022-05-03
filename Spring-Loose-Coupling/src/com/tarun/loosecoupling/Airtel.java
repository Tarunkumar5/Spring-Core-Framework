package com.tarun.loosecoupling;

public class Airtel {
	
	private Service service;

	public void setService(Service service) {
		this.service = service;
	}
	
	public void servicetype()
	{
		service.service();
	}

}
