package vn.techmaster;

import com.google.gson.annotations.SerializedName;

public class Customer {
    @SerializedName("id") //SeriallizedName giống với key của JSON
    Long id;

    @SerializedName("first_name")
    String firstName;

    @SerializedName("last_name")
    String lastName;

    @SerializedName("mobile")
    String phoneNumber;

    @SerializedName("email")
    String email;

    @SerializedName("address")
    String address;

    public Customer(Long id, String firstName, String lastName, String phoneNumber, String email, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    @Override
    public String toString() {
        return id + " - " +firstName+" - " +lastName + " - " +phoneNumber + " - " + email + " - " +address;
    }
}
