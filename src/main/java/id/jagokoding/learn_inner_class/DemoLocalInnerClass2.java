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
public class DemoLocalInnerClass2 {

    static {
        class Foo {

        }
        Foo f = new Foo();
        
    }

    public void bar() {
        if (1 < 2) {
            class Test {
            }
            Test t1 = new Test();
        }
        // Di bawah ini akan menampilkan kesalahan karena ruang lingkup kelas
        // Test t = new Test ();
        // Foo f = new Foo ();
    }
}
