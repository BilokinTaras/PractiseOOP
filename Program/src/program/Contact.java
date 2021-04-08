/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Taras
 */
public class Contact {
    public String firstName;
    public String lastName;
    public String address;

    public Contact(String firstName, String lastName, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public String GetFnameContact() {
        return firstName;
    }

    public String GetLnameContact() {
        return lastName;
    }

    public String GetAddressContact() {
        return address;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + ", " + this.address;
    }
}
