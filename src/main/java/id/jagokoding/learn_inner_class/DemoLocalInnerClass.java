/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inner_class;

/**
 *
 * @author LENOVO
 */
public class DemoLocalInnerClass {

    private String defaultClassName;
    
    public static void main(String[] args) {
        DemoLocalInnerClass demo = new DemoLocalInnerClass();
        demo.print();
    }

    public void print() {
        String nameDefaultMethod = "JAGO KODING";
        // kelas dalam lokal di dalam metode
        class Logger {
            // dapat mengakses atribut kelas
            String name = defaultClassName;
            // dapat mengakses variabel dalam method non-final
            String name1 = nameDefaultMethod;

            public void printName() {
                String name2 = name1;
                
                // Kode di bawah ini akan menampilkan kesalahan waktu kompilasi:
                // Variabel lokal nameDefaultMethod yang ditentukan dalam scope / lingkup harus final
                // nameDefaultMethod= ":";
                System.out.println("name2: " + name2);
            }
        }
        // instantiate kelas dalam lokal dalam metode yang akan digunakan
        Logger logger = new Logger();
        logger.printName();
    }

}
