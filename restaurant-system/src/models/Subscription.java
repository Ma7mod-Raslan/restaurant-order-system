

package models;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Subscription {

    private boolean isSubscribed;
    private double subscriptionCost;
    private LocalDate subscriptionStart;
    private LocalDate subscriptionEnd;
    private static List<User> subscribedUsers = new ArrayList<>(); // List to store subscribed users

    // Constructor to initialize the subscription details
    public Subscription(double subscriptionCost, LocalDate subscriptionStart, LocalDate subscriptionEnd) {
        this.isSubscribed = false; // Initially not subscribed
        this.subscriptionCost = subscriptionCost;
        this.subscriptionStart = subscriptionStart;
        this.subscriptionEnd = subscriptionEnd;
    }

    // Getters and Setters
    public double getSubscriptionCost() {
        return subscriptionCost;
    }

    public void setSubscriptionCost(double subscriptionCost) {
        this.subscriptionCost = subscriptionCost;
    }

    public LocalDate getSubscriptionStart() {
        return subscriptionStart;
    }

    public void setSubscriptionStart(LocalDate subscriptionStart) {
        this.subscriptionStart = subscriptionStart;
    }

    public LocalDate getSubscriptionEnd() {
        return subscriptionEnd;
    }

    public void setSubscriptionEnd(LocalDate subscriptionEnd) {
        this.subscriptionEnd = subscriptionEnd;
    }

    public boolean isSubscribed() {
        return isSubscribed;
    }

    // Static method to get all subscribed users 
    public static List<User> getSubscribedUsers() {
        return subscribedUsers;
    }

    // Method to subscribe a user
    public void subscribe(User user) {
        if (isSubscribed) {
            System.out.println("User is already subscribed.");
            return;
        }

        // Activate subscription
        isSubscribed = true;
        subscriptionStart = LocalDate.now(); // Set the current date as the start of the subscription
        subscribedUsers.add(user); // Add the user to the subscribed users list

        // Display confirmation message
        System.out.println("User " + user.getName() + " subscribed successfully!");
        System.out.println("Subscription started on: " + subscriptionStart);
        System.out.println("Subscription will end on: " + subscriptionEnd);
    }

    // Method to unsubscribe a user
    public void unsubscribe(User user) {
        if (!isSubscribed) {
            System.out.println("User is not currently subscribed.");
            return;
        }

        isSubscribed = false;
        subscribedUsers.remove(user); // Remove the user from the subscribed users list
        System.out.println("User " + user.getName() + " unsubscribed successfully.");
    }

    // Check if the subscription is active based on the current date
    public boolean isSubscriptionActive() {
        LocalDate currentDate = LocalDate.now();
        return isSubscribed && (currentDate.isAfter(subscriptionStart) || currentDate.isEqual(subscriptionStart)) && currentDate.isBefore(subscriptionEnd);
    }

    // Apply discount to an order if subscription is active
    public void applyDiscount(Order order) {
        if (isSubscriptionActive()) {
            double discountAmount = order.getTotalPrice() * 0.10; // 10% discount
            order.setTotalPrice(order.getTotalPrice() - discountAmount);
            System.out.println("Discount applied to order.");
        } else {
            System.out.println("No active subscription. Discount not applied.");
        }
    }
}

 

