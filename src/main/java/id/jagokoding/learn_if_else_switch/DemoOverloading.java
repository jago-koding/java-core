/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jagokoding.id.if_else_switch;

/**
 *
 * @author LENOVO
 */
public class DemoOverloading {
    
    public static void main(String[] args) {
        printData("JAGO KODING");
        printData("JAGO KODING", 18);
    }
    
    //Overloading
    public static void printData(String nama) {
        System.out.println("Nama: " + nama);
    }
    
    //Overloading
    public static void printData(String nama, int umur) {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }
}
