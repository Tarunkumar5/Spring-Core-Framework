package com.tarun.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

	@Autowired
	@Qualifier("humanHeart")
	private Heart heart;

	//Default constructor
	/*
	 * public Human() {
	 * 
	 * }
	 * 
	 * 
	 * public Human(Heart heart) {
	 * 
	 * this.heart = heart; }
	 * 
	 * 
	 * public void setHeart(Heart heart) { 
	 * this.heart = heart; 
	 * }
	 */

	public void startPumping() {
		if (heart != null) {
			heart.pump();
			System.out.println("name of the animal: "+ heart.getNameoftheAnimal() + 
					" No of hearts present: "+ heart.getNoofHeart());
		} else {
			System.out.println("You are dead");
		}
	}
}

/*
 * Note:
 * 
 * How @autowire annotation works? 
 * 1) First it will try to resolve with"byType" 
 * 2) if byType fails then it goes with "byName"
 * 
 * Autowire is not possible for primitive type and string type because
 * how spring could know my data that i wanted to enter like myrollno and myname etc..
 */