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
public interface Shape {

    //deklarasi variabel publik secara implisit, statis dan final
    public String LABLE = "Shape";

    //deklarasi metode interface secara implisit abstrak dan publik
    void draw();

    double getArea();
}
