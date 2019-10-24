package model;

import behaviour.DogSound;

public class Dog extends Animal {
	
	public Dog () {
    this.singable = new DogSound();
	}


}
