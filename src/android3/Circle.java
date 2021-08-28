/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package android3;

/**
 *
 * @author antho
 */
public class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    
    
    @Override
    public double getArea(){
        return Math.PI * (radius * radius);
    }
}
