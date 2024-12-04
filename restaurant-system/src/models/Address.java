package models;

public class Address {
    private String street;
    private String city;
    private String postalCode;
    private String country;

    // Constructor to initialize the address fields
    public Address(String street, String city, String postalCode, String country) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
        this.country = country;
    }
    


    // Getters and Setters for each address field
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    // Validate the address fields
public boolean validate() {
    try {
        // Ensure none of the address fields are null or empty
        boolean isValid = (street != null && !street.isEmpty()) &&
                          (city != null && !city.isEmpty()) &&
                          (postalCode != null && !postalCode.isEmpty()) &&
                          (country != null && !country.isEmpty());
        
        if (isValid) {
            System.out.println("Address is valid.");
        } else {
            System.out.println("Address is incomplete. Please fill all fields.");
        }
        
        return isValid;
    } catch (Exception e) {
        System.out.println("Error validating the address: " + e.getMessage());
        return false; // Return false if an error occurs
    }
}

// Override toString method to display the address
@Override
public String toString() {
    try {
        // Check if any of the address fields are null before using them
        if (street == null || city == null || postalCode == null || country == null) {
            throw new NullPointerException("One or more address fields are null.");
        }
        
        return "Address:\n" +
               "Street: " + street + "\n" +
               "City: " + city + "\n" +
               "Postal Code: " + postalCode + "\n" +
               "Country: " + country;
    } catch (NullPointerException e) {
        System.out.println("Error: " + e.getMessage());
        return "Address details are incomplete or invalid.";
    } catch (Exception e) {
        System.out.println("Unexpected error in toString method: " + e.getMessage());
        return "Error in displaying address.";
    }
}


}

