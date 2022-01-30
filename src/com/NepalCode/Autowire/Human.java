package com.NepalCode.Autowire;

public class Human {
	
	private int numberofHeart;
	
	private Heart heart;

	
	
	// how to inject those object variable: use setter and constructor injection
	
	/*public Human(int numberofHeart, Heart heart) {
		super();
		this.numberofHeart = numberofHeart;
		this.heart = heart;
	}
	*/


	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	
	
	public void setNumberofHeart(int numberofHeart) {
		this.numberofHeart = numberofHeart;
	}



	public void startPumping() {
	 if(heart != null) {
		 heart.pump();
	 }
	 else {
		 System.out.println("you have no life");
	 }
	}
	
	
}
