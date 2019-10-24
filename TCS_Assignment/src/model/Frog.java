package model;

import behaviour.CanSing;

public class Frog extends Animal {
	public Frog() {
		this.singable = new CanSing();
	}

}
