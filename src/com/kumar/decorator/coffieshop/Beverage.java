package com.kumar.decorator.coffieshop;

public abstract class Beverage {
    public enum Size{ TAIL, GRANDE, VENTI}
    Size size = Size.TAIL;

    String description = "Unknown Beverage";

    public String getDescription(){
        return description;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    // cost method
    public  abstract  Double cost();

}
