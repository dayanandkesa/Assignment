package model;

import behaviour.CanFly;
import behaviour.CanNotSing;

public class Butterfly extends Caterpillar {
	public Butterfly() {
        this.flyable =new CanFly();
        this.singable= new CanNotSing();
	}
}
