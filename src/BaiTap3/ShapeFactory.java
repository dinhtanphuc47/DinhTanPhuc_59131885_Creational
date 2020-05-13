/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author admin
 */
public class ShapeFactory {
    
    public Shape createShape(ShapeType shapetype) {
        
        Shape shape;
        switch (shapetype) {
            case rectangle: return Rectangle.createInstance();
            case triangle: return Triangle.createInstance();
            case circle: return Circle.createInstance();
        }
        return null;
    }
}
