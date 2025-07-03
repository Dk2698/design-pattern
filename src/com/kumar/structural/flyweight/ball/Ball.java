package com.kumar.structural.flyweight.ball;

public class Ball {
    private String color; //
    private String imageUrl; //

    private int coordX;
    private int coordY;

    private int radius;

    public Ball(String color, String imageUrl){
        this.color = color;
        this.imageUrl = imageUrl;
    }

    public void setCoordX(int coordX) {
        this.coordX = coordX;
    }

    public void setCoordY(int coordY) {
        this.coordY = coordY;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void draw(){

    }
}
