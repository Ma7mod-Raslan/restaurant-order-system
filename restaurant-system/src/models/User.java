/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pc
 */
public class User {
    //// Attributes
    private String name;
    private String userID;
    private String username;
    private String password;
    private Address address;
    private boolean isEliteCustomer;  // True if the user is subscribed to Elite service
    private List<Order> orderHistory; // List to store orders placed by the user
// Constructor
    public User(String name, String userID, String username, String password, Address address) {
        this.name = name;
        this.userID = userID;
        this.username = username;
        this.password = password;
        this.address = address;
        this.isEliteCustomer = false;  // Default is not Elite
        this.orderHistory = new ArrayList<>();
    }

    // Getter and Setter methods 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public boolean isEliteCustomer() {
        return isEliteCustomer;
    }

    public void setEliteCustomer(boolean isEliteCustomer) {
        this.isEliteCustomer = isEliteCustomer;
    }

    public List<Order> getOrderHistory() {
        return orderHistory;
    }
    // Methods
    // Method 1 (Subscribe to Elite service)
public void subscribeToElite() {
    try {
        if (!isEliteCustomer) {
            isEliteCustomer = true;
            System.out.println("You are now an Elite Customer! Enjoy your 10% discount on future orders.");
        } else {
            System.out.println("You are already an Elite Customer.");
        }
    } catch (Exception e) {
        System.out.println("Error subscribing to Elite service: " + e.getMessage());
    }
}

// Method 2 (Update profile details)
public void updateProfile(Address newAddress, String newPassword) {
    try {
        if (newAddress == null) {
            throw new IllegalArgumentException("New address cannot be null.");
        }
        if (newPassword == null || newPassword.isEmpty()) {
            throw new IllegalArgumentException("New password cannot be null or empty.");
        }

        this.address = newAddress;
        this.password = newPassword;
        System.out.println("Profile updated successfully.");
    } catch (IllegalArgumentException e) {
        System.out.println("Error updating profile: " + e.getMessage());
    } catch (Exception e) {
        System.out.println("Unexpected error while updating profile: " + e.getMessage());
    }
}

// Method 3 (Update order history)
public void updateHistory(Order newOrder) {
    try {
        if (newOrder == null) {
            throw new IllegalArgumentException("Order cannot be null.");
        }

        this.orderHistory.add(newOrder);
        System.out.println("Order history updated.");
    } catch (IllegalArgumentException e) {
        System.out.println("Error updating order history: " + e.getMessage());
    } catch (Exception e) {
        System.out.println("Unexpected error while updating order history: " + e.getMessage());
    }
}

// Print user info (for testing)
public void printUserInfo() {
    try {
        System.out.println("User Info:");
        System.out.println("Name: " + name);
        System.out.println("Username: " + username);

        if (address == null) {
            throw new IllegalStateException("Address is not set.");
        }
        System.out.println("Address: " + address);

        System.out.println("Elite Status: " + (isEliteCustomer ? "Yes" : "No"));

        if (orderHistory == null || orderHistory.isEmpty()) {
            throw new IllegalStateException("Order history is empty.");
        }

        System.out.println("Order History: ");
        for (Order order : orderHistory) {
            if (order == null) {
                System.out.println("Error: Order is null.");
            } else {
                System.out.println("  - Order ID: " + order.getOrderID() + ", Total Price: " + order.getTotalPrice());
            }
        }
    } catch (IllegalStateException e) {
        System.out.println("Error displaying user info: " + e.getMessage());
    } catch (Exception e) {
        System.out.println("Unexpected error while printing user info: " + e.getMessage());
    }
}

    
    @Override
    public String toString() {
        return "User{id=" + userID + ", name='" + name + "', Address='" + address + "'}";
}

}

