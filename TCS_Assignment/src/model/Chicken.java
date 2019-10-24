package model;

import behaviour.CanNotFly;
import behaviour.ChickenSound;

public class Chicken extends Bird {

    public  Chicken(){
        this.singable=new ChickenSound();
        this.flyable =new CanNotFly();
    }
}
