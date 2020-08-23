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
public class DemoOverridding {
    
    public static void main(String[] args) {
        Hewan kucing = new Kucing();
        Hewan Harimau = new Harimau();
        
        kucing.suara();
        Harimau.suara();
    }
}

class Hewan {
    
    protected void suara() {
        System.out.println("Hewan Style");
    }
    
}

class Kucing extends Hewan{

    //Overridding
    @Override
    protected void suara() {
        // Call method super class
        super.suara();
        System.out.println("Meong");
    }
    
}

class Harimau extends Hewan{

    //Overridding
    @Override
    protected void suara() {
        System.out.println("Aung Aung");
    }
    
}