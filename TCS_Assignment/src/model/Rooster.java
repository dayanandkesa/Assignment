package model;

import behaviour.RoosterSound;

public class Rooster extends Bird {

    Chicken chicken;

    public Rooster(){
        this.singable= new RoosterSound();
        this.chicken=new Chicken();
    }

    @Override
    public void fly(){
        this.chicken.fly();
    }
}
