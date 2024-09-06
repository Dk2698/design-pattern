package com.kumar.solid;

public interface Shape {

    double area();
//    double volume(); // circle is not 3D shape but implent violation of rule interface segregation
//    handle -> create new interface ThreeDimensionShape and implements where is need
}
