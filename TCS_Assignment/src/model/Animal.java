package model;

import behaviour.CanWalk;

public class Animal extends LivingThing {

    public Animal() {
        this.walkable = new CanWalk();
    }
}
