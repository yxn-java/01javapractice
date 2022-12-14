package com.javapractice.designTypes.bridge;

abstract class Shape {
    protected Printer print;
    protected Shape(Printer p){
        this.print = p;
    }
    public abstract void draw();
}
