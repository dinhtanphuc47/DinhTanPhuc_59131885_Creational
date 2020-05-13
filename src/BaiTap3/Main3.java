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
public class Main3 {
    public static void main(String[] args) {
        
        Shape shape =  new ShapeFactory().createShape(ShapeType.circle);
        System.out.println(shape.toString());
        
        Shape shape1 = new ShapeFactory().createShape(ShapeType.rectangle);
        System.out.println(shape1.toString());
        
        Shape shape2 = new ShapeFactory().createShape(ShapeType.triangle);
        System.out.println(shape2.toString());
    }
}
