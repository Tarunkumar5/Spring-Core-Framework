package com.tarun.di;

public class Student {

	// MathCheat mathcheat = new MathCheat();
	// this is not a good coding approach because we have hard coded this
	// we are doing tight coupling over here
	// if we do use "new" keyword its a kind of tight coupling

	private int id;
	private MathCheat mathcheat;

	// inject the 'mathcheat' object using setter injection

	public void setId(int id) {
		this.id = id;
	}

	public void setMathcheat(MathCheat mathcheat) {
		this.mathcheat = mathcheat;
	}

	public void StudentCheating() {
		mathcheat.mathCheat();
		System.out.println("Hey my id is " + id + " do whatever you want to do");
	}

}
