
package models;

import java.util.ArrayList;
import java.util.List;

public class category{
   private String categoryName;
    private List<Item> items;

    // Constructor to initialize the category with a name
    public category(String categoryName) {
        try {
            if (categoryName == null || categoryName.isEmpty()) {
                throw new IllegalArgumentException("Category name cannot be null or empty.");
            }
            this.categoryName = categoryName;
            this.items = new ArrayList<>();
        } catch (IllegalArgumentException e) {
            System.err.println("Error creating category: " + e.getMessage());
        }
//        setCategoryName(categoryName);
    }


    // Get all items in the category
    public List<Item> getItems() {
        return items;
    }

    // Get and Set category name
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
         try {
            if (categoryName == null || categoryName.isEmpty()) {
                throw new IllegalArgumentException("Category name cannot be null or empty.");
            }
            this.categoryName = categoryName;
        } catch (IllegalArgumentException e) {
            System.err.println("Error setting category name: " + e.getMessage());
        }
    }
    
    // Method to add an item to the category
    public void addItemToCategory(Item item) {
          try {
            if (item == null) {
                throw new IllegalArgumentException("Item cannot be null.");
            }
            if (items.contains(item)) {
                System.out.println("Item already exists in the category.");
                return;
            }
            items.add(item);
            System.out.println("Item added to category.");
        } catch (IllegalArgumentException e) {
            System.err.println("Error adding item to category: " + e.getMessage());
        }
    }

    // Method to remove an item from the category
    public void removeItemFromCategory(Item item) {
         try {
            if (item == null) {
                throw new IllegalArgumentException("Item cannot be null.");
            }
            if (!items.contains(item)) {
                System.out.println("Item not found in the category.");
                return;
            }
            items.remove(item);
            System.out.println("Item removed from category.");
        } catch (IllegalArgumentException e) {
            System.err.println("Error removing item from category: " + e.getMessage());
        }
    }

    // Display all items in the category
    public void displayItems() {
          try {
            if (items.isEmpty()) {
                System.out.println("No items in category: " + categoryName);
                return;
            }
            System.out.println("Items in category " + categoryName + ":");
            for (Item item : items) {
                System.out.println(item.getName() + " - $" + item.getPrice());
            }
        } catch (Exception e) {
            System.err.println("Error displaying items: " + e.getMessage());
        }
    }

}

