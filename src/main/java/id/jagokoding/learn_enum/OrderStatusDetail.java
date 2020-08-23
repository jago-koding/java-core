package tutorial_enum;

import java.io.Closeable;
import java.io.IOException;

/**
 *
 * @author https://www.jagokoding.id
 */
public enum OrderStatusDetail implements Closeable {

    MENUNGGU(1) {
        @Override
        public String toString() {
            return "Menunggu. Priority=" + getPriority();
        }

        @Override
        public String getDetail() {
            return "Menunggu";
        }
    },
    DIBATALKAN(2) {
        @Override
        public String getDetail() {
            return "Dibatalkan";
        }
    },
    DISETUJUI(3) {
        @Override
        public String getDetail() {
            return "Disetujui";
        }
    },
    DITOLAK(4) {
        @Override
        public String getDetail() {
            return "Ditolak";
        }
    };

    private int priority;

    public abstract String getDetail();
    //Konstruktor enum harus selalu bersifat private.

    private OrderStatusDetail(int i) {
        priority = i;
    }

    //Enum dapat memiliki metode
    public int getPriority() {
        return this.priority;
    }

    public void setPriority(int p) {
        this.priority = p;
    }

    //Enum override method impl
    @Override
    public String toString() {
        return "Default Priority=" + getPriority();
    }

    @Override
    public void close() throws IOException {
        System.out.println("Close of Enum");
    }
}
