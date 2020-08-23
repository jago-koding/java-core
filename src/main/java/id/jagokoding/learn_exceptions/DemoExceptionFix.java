package exception;

/**
 *
 * @author https://www.jagokoding.id
 */
public class DemoExceptionFix {

    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println("Str: " + str.length());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            str = "JAGO KODING";
        }
        System.out.println("Str: " + str.length());
    }
}
