package model;

import behaviour.Flyable;
import behaviour.Singable;
import behaviour.Swimmable;
import behaviour.Walkable;

public abstract class LivingThing {

    protected Walkable walkable;
    protected Flyable flyable;
    protected Singable singable;
    protected Swimmable swimmable;

    public void walk(){
        this.walkable.walk();
    }

    public void fly() {
        this.flyable.fly();
    }

    public void sing() {
        this.singable.sing();
    }

    public void swim() {
        this.swimmable.swim();
    }

	public Walkable getWalkable() {
		return walkable;
	}

	public void setWalkable(Walkable walkable) {
		this.walkable = walkable;
	}

	public Flyable getFlyable() {
		return flyable;
	}

	public void setFlyable(Flyable flyable) {
		this.flyable = flyable;
	}

	public Singable getSingable() {
		return singable;
	}

	public void setSingable(Singable singable) {
		this.singable = singable;
	}

	public Swimmable getSwimmable() {
		return swimmable;
	}

	public void setSwimmable(Swimmable swimmable) {
		this.swimmable = swimmable;
	}
    
    
}
