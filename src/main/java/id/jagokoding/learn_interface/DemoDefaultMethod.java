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
public class DemoDefaultMethod implements DefaultMethod, DefaultMethod2 {

    private String str;
    
    @Override
    public void printStr(String str) {
        this.str = str;
        System.out.println(str);
    }

    @Override
    public void log(String str) {
        this.str = str;
        System.out.println("DemoDefaultMethod logging::" + str);
    }

    @Override
    public void printStr() {
        System.out.println(this.str);
    }

}
