package model;

import behaviour.CatSound;

public class Cat extends Animal {

    public Cat(){
        this.singable= new CatSound();
    }
}