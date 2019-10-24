package model;

import behaviour.CanNotFly;
import behaviour.CrawlWalk;

public class Caterpillar extends Animal {
    public Caterpillar(){
        this.flyable= new CanNotFly();
        this.walkable= new CrawlWalk();
    }
}
