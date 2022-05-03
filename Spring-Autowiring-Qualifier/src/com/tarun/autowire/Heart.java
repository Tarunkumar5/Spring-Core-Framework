package com.tarun.autowire;

public class Heart {
	
	private String nameoftheAnimal;
	private int noofHeart;
	
	
	
	public String getNameoftheAnimal() {
		return nameoftheAnimal;
	}



	public void setNameoftheAnimal(String nameoftheAnimal) {
		this.nameoftheAnimal = nameoftheAnimal;
	}



	public int getNoofHeart() {
		return noofHeart;
	}



	public void setNoofHeart(int noofHeart) {
		this.noofHeart = noofHeart;
	}



	public void pump()
	{
		System.out.println("Your heart is pumping");
		System.out.println("You are alive");
	}

}
