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
import inner_class.OuterClass.InnerClass;
import inner_class.OuterClass.StaticNestedClass;
import java.util.Arrays;
// kelas bersarang dapat digunakan dalam impor untuk memudahkan pembuatan instance
//import id.jagokoding.InnerClass;
//import id.jagokoding.StaticNestedClass;

public class InnerClassTest {

    public static void main(String[] args) {
        OuterClass outer = new OuterClass(1,2,3,4);
        
        // contoh kelas bertingkat statis
        StaticNestedClass staticNestedClass = new StaticNestedClass();
        StaticNestedClass staticNestedClass1 = new StaticNestedClass();
        
        System.out.println(staticNestedClass.getName());
        staticNestedClass.d=10;
        System.out.println(staticNestedClass.d);
        System.out.println(staticNestedClass1.d);
        
        //contoh kelas dalam
        InnerClass innerClass = outer.new InnerClass();
        System.out.println(innerClass.getName());
        System.out.println(innerClass);
        innerClass.setValues();
        System.out.println(innerClass);
        
        //memanggil metode menggunakan kelas dalam lokal
        outer.print("Outer");
        
        //memanggil metode menggunakan kelas dalam anonim
        System.out.println(Arrays.toString(outer.getFilesInDir("src/id/jagokoding/nested", ".java")));
        
        System.out.println(Arrays.toString(outer.getFilesInDir("bin/id/jagokoding/nested", ".class")));
    }

}
