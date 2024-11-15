
package models;
import java.util.Date;

/*
    @author moham
 */
public class Delivery {
    
    // Fields
    private int deliveryID;
    private Order order;              // Associated Order
    private Address deliveryAddress; // Delivery address from Order
    private Date estimatedDeliveryTime;
    private String deliveryStatus;   
//    Status: "Preparing", "On the Way", "Delivered", etc.

    // Constructor
    public Delivery(int deliveryID, Order order, Address deliveryAddress, Date estimatedDeliveryTime) {
        this.deliveryID = deliveryID;
        this.order = order;
        this.deliveryAddress = deliveryAddress;
        this.estimatedDeliveryTime = estimatedDeliveryTime;
        this.deliveryStatus = "Preparing";
             /*
                this.deliveryAddress = order.getDeliveryAddress();
                this.deliveryStatus = "Preparing";  // Default initial status
                this.estimatedDeliveryTime = new Date();  // Set initial estimate (customize as needed)
             */
    }

    // Getters and Setters
    public int getDeliveryID() {
        return deliveryID;
    }

    public Order getOrder() {
        return order;
    }

    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public Date getEstimatedDeliveryTime() {
        return estimatedDeliveryTime;
    }

    public void setEstimatedDeliveryTime(Date estimatedDeliveryTime) {
        this.estimatedDeliveryTime = estimatedDeliveryTime;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    // Methods
    public void updateDeliveryStatus(String newStatus) {
        this.deliveryStatus = newStatus;
        System.out.println("Delivery status updated to: " + newStatus);
    }

    public void calculateEstimatedDeliveryTime() {
        // Example: setting delivery time based on the current time
        Date currentTime = new Date();
        long estimatedTime = currentTime.getTime() + (2 * 60 * 60 * 1000); // Adds 2 hours
        this.estimatedDeliveryTime = new Date(estimatedTime);
        System.out.println("Estimated delivery time set to: " + estimatedDeliveryTime);
    }
    
}

/*
    public enum DeliveryStatus {
        PENDING,
        DISPATCHED,
        IN_TRANSIT,
        DELIVERED,
        CANCELLED
    }
*/