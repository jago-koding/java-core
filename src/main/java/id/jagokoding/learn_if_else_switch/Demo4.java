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
public class Demo4 {
    
    public static void main(String[] args) {
        char grade = 'B';
        switch(grade) {
            case 'A':
                System.out.println("Hadiah 1 paket perlengkapan sekolah");
                break;
            case 'B':
                System.out.println("Hadiah 1 paket alat tulis");
                break;   
            case 'C':
                System.out.println("Hadiah 1 pack buku");
                break;
            default:
                System.out.println("Tidak dapat hadiah");
        }
    }
}
