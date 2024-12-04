
package models;

import java.util.ArrayList;
import java.util.List;

public class category{
    private String categoryName;
    private List<Item> items;

    // Constructor to initialize the category with a name
    public category(String categoryName) {
        this.categoryName = categoryName;
        this.items = new ArrayList<>();
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
        this.categoryName = categoryName;
    }
    
   // Method to add an item to the category
public void addItemToCategory(Item item) {
    try {
        if (item == null) {
            throw new IllegalArgumentException("Item cannot be null.");
        }
        
        items.add(item);
        System.out.println("Item added to category.");
    } catch (IllegalArgumentException e) {
        System.out.println("Error adding item: " + e.getMessage());
    } catch (Exception e) {
        System.out.println("Unexpected error while adding item: " + e.getMessage());
    }
}

// Method to remove an item from the category
public void removeItemFromCategory(Item item) {
    try {
        if (item == null) {
            throw new IllegalArgumentException("Item cannot be null.");
        }

        if (!items.contains(item)) {
            throw new IllegalStateException("Item not found in category.");
        }

        items.remove(item);
        System.out.println("Item removed from category.");
    } catch (IllegalArgumentException e) {
        System.out.println("Error removing item: " + e.getMessage());
    } catch (IllegalStateException e) {
        System.out.println("Error removing item: " + e.getMessage());
    } catch (Exception e) {
        System.out.println("Unexpected error while removing item: " + e.getMessage());
    }
}

// Display all items in the category
public void displayItems() {
    try {
        if (items == null || items.isEmpty()) {
            throw new IllegalStateException("No items to display.");
        }

        System.out.println("Items in category " + categoryName + ":");
        for (Item item : items) {
            if (item != null) {
                System.out.println(item.getName() + " - $" + item.getPrice());
            } else {
                System.out.println("Item is null.");
            }
        }
    } catch (IllegalStateException e) {
        System.out.println("Error displaying items: " + e.getMessage());
    } catch (Exception e) {
        System.out.println("Unexpected error while displaying items: " + e.getMessage());
    }
}

}

