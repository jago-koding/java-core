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
public interface DefaultMethod2 {

    void printStr();

    default void log(String str) {
        System.out.println("logging::" + str);
    }
}
