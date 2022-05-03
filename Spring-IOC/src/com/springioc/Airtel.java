package com.springioc;

public class Airtel implements Sim {

	@Override
	public void Calling() {
		System.out.println("Calling using Airtel");

	}

	@Override
	public void Browsing() {
		System.out.println("Browsing using Airtel");

	}

}
