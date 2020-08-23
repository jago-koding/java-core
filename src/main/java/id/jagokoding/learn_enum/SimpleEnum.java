package tutorial_enum;

import java.io.IOException;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Set;

/**
 *
 * @author https://www.jagokoding.id
 */
public class SimpleEnum {

    public static void main(String[] args) throws IOException {

        enumMethodsExample();
        enumValueOfExample();
        enumValuesExample();

        enumSwitchExample(OrderStatusDetail.DITOLAK);
        enumSwitchExample(OrderStatusDetail.DISETUJUI);

        enumMapExample();
        enumSetExample();

    }

    private static void enumSetExample() {
        EnumSet<OrderStatusDetail> enumSet = EnumSet.allOf(OrderStatusDetail.class);
        for (OrderStatusDetail order : enumSet) {
            System.out.println("EnumSet, priority = " + order.getPriority());
        }
    }

    private static void enumMapExample() {
        EnumMap<OrderStatusDetail, String> enumMap = new EnumMap<OrderStatusDetail, String>(OrderStatusDetail.class);
        enumMap.put(OrderStatusDetail.MENUNGGU, "Status menunggu");
        enumMap.put(OrderStatusDetail.DIBATALKAN, "Status dibatalkan");
        enumMap.put(OrderStatusDetail.DISETUJUI, "Status disetujui");
        enumMap.put(OrderStatusDetail.DITOLAK, "Status ditolak");

        Set<OrderStatusDetail> keySet = enumMap.keySet();
        for (OrderStatusDetail key : keySet) {
            System.out.println("key=" + key.toString() + ":: value=" + enumMap.get(key));
        }

    }

    private static void enumSwitchExample(OrderStatusDetail os) {
        switch (os) {
            case MENUNGGU:
                System.out.println("Menunggu");
                break;
            case DIBATALKAN:
                System.out.println("Dibatalkan");
                break;
            case DISETUJUI:
                System.out.println("Disetujui");
                break;
            case DITOLAK:
                System.out.println("Ditolak");
        }
    }

    private static void enumValuesExample() {
        OrderStatusDetail[] thArray = OrderStatusDetail.values();

        for (OrderStatusDetail os : thArray) {
            System.out.println(os.toString() + "::priority=" + os.getPriority());
        }
    }

    private static void enumValueOfExample() {
        OrderStatusDetail os = Enum.valueOf(OrderStatusDetail.class, "MENUNGGU");
        System.out.println("th priority=" + os.getPriority());
    }

    private static void enumMethodsExample() throws IOException {
        OrderStatusDetail os = OrderStatusDetail.MENUNGGU;
        System.out.println("priority:" + os.getPriority());

        os = OrderStatusDetail.DIBATALKAN;
        System.out.println("override method." + os.toString());

        os = OrderStatusDetail.DIBATALKAN;
        System.out.println("override method." + os.toString());
        os.setPriority(10);
        System.out.println("Variabel Enum Constant mengubah nilai prioritas=" + os.getPriority());
        os.close();
    }
}
