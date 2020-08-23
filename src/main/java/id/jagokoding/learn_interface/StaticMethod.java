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
public interface StaticMethod {

    default void print(String str) {
        if (!isNull(str)) {
            System.out.println("StaticMethod Print::" + str);
        }
    }

    static boolean isNull(String str) {
        System.out.println("Interface Null Check");

        return str == null ? true : "".equals(str) ? true : false;
    }
}
