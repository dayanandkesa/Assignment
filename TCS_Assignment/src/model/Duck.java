package model;

import behaviour.CanSwim;
import behaviour.DuckSound;

public class Duck extends Bird {

    public Duck(){
        this.singable =new DuckSound();
        this.swimmable= new CanSwim();
    }
}
