/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author pc
 */
public class Item {
       private String itemId;     // Unique identifier for the item
    private String name;       // Name of the item (e.g., "Burger", "Pizza")
    private String category;   // Category of the item (e.g., "Main Course", "Dessert")
    private double price;      // Price of the item
    private String description; // Description of the item (optional)
    
    // Constructor 
    public Item(String itemId, String name, String category, double price, String description) {
        try {
            if (itemId == null || itemId.isEmpty()) {
                throw new IllegalArgumentException("Item ID cannot be null or empty.");
            }
            if (name == null || name.isEmpty()) {
                throw new IllegalArgumentException("Name cannot be null or empty.");
            }
            if (category == null || category.isEmpty()) {
                throw new IllegalArgumentException("Category cannot be null or empty.");
            }
            if (price < 0) {
                throw new IllegalArgumentException("Price cannot be negative.");
            }
            this.itemId = itemId;
            this.name = name;
            this.category = category;
            this.price = price;
            this.description = description;
        } catch (IllegalArgumentException e) {
            System.err.println("Error creating item: " + e.getMessage());
        }
    }
// Getter and Setter
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        try {
            if (itemId == null || itemId.isEmpty()) {
                throw new IllegalArgumentException("Item ID cannot be null or empty.");
            }
            this.itemId = itemId;
        } catch (IllegalArgumentException e) {
            System.err.println("Error setting item ID: " + e.getMessage());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        try {
            if (name == null || name.isEmpty()) {
                throw new IllegalArgumentException("Name cannot be null or empty.");
            }
            this.name = name;
        } catch (IllegalArgumentException e) {
            System.err.println("Error setting name: " + e.getMessage());
        }
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
         try {
            if (category == null || category.isEmpty()) {
                throw new IllegalArgumentException("Category cannot be null or empty.");
            }
            this.category = category;
        } catch (IllegalArgumentException e) {
            System.err.println("Error setting category: " + e.getMessage());
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
         try {
            if (price < 0) {
                throw new IllegalArgumentException("Price cannot be negative.");
            }
            this.price = price;
        } catch (IllegalArgumentException e) {
            System.err.println("Error setting price: " + e.getMessage());
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
       try {
            this.description = description;
        } catch (Exception e) {
            System.err.println("Error setting description: " + e.getMessage());
        }
    }
    //metode 1
  public void updatePrice(double newPrice) {
       try {
            if (newPrice < 0) {
                throw new IllegalArgumentException("New price cannot be negative.");
            }
            this.price = newPrice;
            System.out.println("The price of " + name + " has been updated to: " + newPrice);
        } catch (IllegalArgumentException e) {
            System.err.println("Error updating price: " + e.getMessage());
        }
    }
  //Methode 2
  // Method to update the description of the item
    public void updateDescription(String newDescription) {
          try {
            if (newDescription == null) {
                throw new IllegalArgumentException("Description cannot be null.");
            }
            this.description = newDescription;
            System.out.println("The description of " + name + " has been updated.");
        } catch (IllegalArgumentException e) {
            System.err.println("Error updating description: " + e.getMessage());
        }
    }
     // Method to display item information (for testing)
    public void displayItemInfo() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Name: " + name);
        System.out.println("Category: " + category);
        System.out.println("Price: " + price);
        System.out.println("Description: " + description);
    }
}
