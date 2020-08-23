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
public enum OrderStatusInstance {
    
    MENUNGGU("Status menunggu"),
    DIBATALKAN("Status dibatalkan"),
    DISETUJUI("Status disetujui"),
    DITOLAK("Status ditolak");
    
    private final String status;

    private OrderStatusInstance(String status) {
        this.status = status;
    }

    public String status() {
        return status;
    }
    
}
