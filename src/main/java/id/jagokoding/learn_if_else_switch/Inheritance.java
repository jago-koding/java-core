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
public class Inheritance {
    
    public static void main(String[] args) {
        Honda honda = new Honda();
//        honda.setMerek("HONDA");
//        honda.setNama("Vario");
//        honda.setKecepatan("125 km/jam");
        
        honda.printData();
    }
}

// Super Class
class Motor1 {
   private String merek;
   
   public Motor1() {}
   
   public Motor1(String merek) {
       this.merek = merek;
   }
   
   protected void setMerek(String merek) {
         this.merek = merek;
   }

   protected String getMerek() {
       return this.merek;
   }
}

//Sub Class
class Honda1 extends Motor1 {
   private String nama;
   private String kecepatan;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(String kecepatan) {
        this.kecepatan = kecepatan;
    }
   
    public void printData() {
        System.out.println("Merek: " + this.getMerek());
        System.out.println("Nama: " + this.nama);
        System.out.println("Kecepatan: " + this.kecepatan);
    }
}