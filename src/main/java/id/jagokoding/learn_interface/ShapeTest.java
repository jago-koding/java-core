/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.jagokoding.learn_interface;

import id.jagokoding.learn_interface.*;

/**
 *
 * @author LENOVO
 */
public class ShapeTest {

    public static void main(String[] args) {

        //Konsep polimorfisme, instansiasi interface dengan object class yang mengimplemantasikan
        Shape shape = new Circle(10);

        shape.draw();
        System.out.println("Area=" + shape.getArea());

        shape = new Rectangle(10, 10);
        shape.draw();
        System.out.println("Area=" + shape.getArea());
    }

}
