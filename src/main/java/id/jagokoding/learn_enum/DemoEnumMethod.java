/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial_enum;

/**
 *
 * @author https://www.jagokoding.id
 */
enum Operation {
    PLUS,
    MINUS,
    TIMES,
    DIVIDE;

    double calculate(double x, double y) {
        switch (this) {
            case PLUS:
                return x + y;
            case MINUS:
                return x - y;
            case TIMES:
                return x * y;
            case DIVIDE:
                return x / y;
            default:
                throw new AssertionError("Operasi tidak diketahui " + this);
        }
    }

}

public class DemoEnumMethod {
    
    public static void main(String[] args) {
        System.out.println(Operation.PLUS.calculate(5, 10));
    }
}