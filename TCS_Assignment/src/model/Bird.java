package model;

import behaviour.CanFly;
import behaviour.CanSing;
import behaviour.CanWalk;

public class Bird extends LivingThing {

    public Bird(){
        this.walkable=new CanWalk();
        this.flyable =new CanFly();
        this.singable=new CanSing();
    }
}