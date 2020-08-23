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
public class DemoPolimorfisme {

    public static void main(String[] args) {
        Motor honda = new Honda();
        Motor suzuki = new Suzuki();
        
        honda.printData();
        suzuki.printData();
    }
}

// Super Class
class Motor {

    public void printData() {
        System.out.println("Merek: ");
        System.out.println("Kecepatan: ");
    }

}

//Sub Class 1
class Honda extends Motor {

    @Override
    public void printData() {
        System.out.println("Merek: Honda");
        System.out.println("Kecepatan: 125 km/jam");
    }

}

//Sub Class 2
class Suzuki extends Motor {

    @Override
    public void printData() {
        System.out.println("Merek: Satria");
        System.out.println("Kecepatan: 150 km/jam");
    }

}