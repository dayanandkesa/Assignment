package model;


import behaviour.CanNotSing;
import behaviour.CanNotWalk;
import behaviour.CanSwim;

public class Fish extends LivingThing {

	protected Size size;
	protected model.Color color;

	public Fish() {
		this.swimmable = new CanSwim();
		this.walkable = new CanNotWalk();
		this.singable = new CanNotSing();
	}

	public Size size() {
		return size;
	}

	public Color color() {
		return color;
	}
}