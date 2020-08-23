package tutorial_enum;

/**
 *
 * @author https://www.jagokoding.id
 */
public class DemoEnumConstant {

    public static void main(String[] args) {

        // nilai enum yang sudah di tetapkan
        printOrderStatusByEnum(OrderStatus.MENUNGGU);
        printOrderStatusByEnum(OrderStatus.DIBATALKAN);
        printOrderStatusByEnum(OrderStatus.DISETUJUI);
        printOrderStatusByEnum(OrderStatus.DITOLAK);
        printOrderStatusByEnum(null);
        
        printOrderStatusByConstant(1);
        printOrderStatusByConstant(2);
        printOrderStatusByConstant(3);
        printOrderStatusByConstant(4);
        // kita bisa melewatkan nilai int lainnya
        printOrderStatusByConstant(5);
    }

    public static void printOrderStatusByEnum(OrderStatus orderStatus) {
        if (orderStatus == OrderStatus.MENUNGGU) {
            System.out.println("STATUS MENUNGGU");
        } else if (orderStatus == OrderStatus.DIBATALKAN) {
            System.out.println("STATUS DIBATALKAN");
        } else if (orderStatus == OrderStatus.DISETUJUI) {
            System.out.println("STATUS DISETUJUI");
        } else if (orderStatus == OrderStatus.DITOLAK) {
            System.out.println("STATUS DITOLAK");
        } else {
            System.out.println("STATUS TIDAK DIKETAHUI!");
        }
    }
    
    public static void printOrderStatusByConstant(int numStatus) {
        if (numStatus == OrderStatusConstant.MENUNGGU) {
            System.out.println("STATUS MENUNGGU");
        } else if (numStatus == OrderStatusConstant.DIBATALKAN) {
            System.out.println("STATUS DIBATALKAN");
        } else if (numStatus == OrderStatusConstant.DISETUJUI) {
            System.out.println("STATUS DISETUJUI");
        } else if (numStatus == OrderStatusConstant.DITOLAK) {
            System.out.println("STATUS DITOLAK");
        } else {
            System.out.println("STATUS TIDAK DIKETAHUI!");
        }
    }
}
