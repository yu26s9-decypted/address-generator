package com.pluralsight;


import com.pluralsight.ui.Console;

public class Main {
    static void main() {
        // create a StringBuillder object
        StringBuilder addressBuilder = new StringBuilder();
// append strings to the StringBuilder object

        String name = Console.askForString("Full name: ");
        String billingAddress = Console.askForString("Billing Street:");
        String billingCity = Console.askForString("Billing City:");
        String billingState = Console.askForString("Billing State:");
        String billingZip = Console.askForString("Billing Zip:");

        String shippingStreet = Console.askForString("Shipping Street:");
        String shippingCity = Console.askForString("Shipping City:");
        String shippingState = Console.askForString("Shipping State:");
        String shippingZip = Console.askForString("Shipping Zip:");


        addressBuilder.append("\n Full name: " + name);
        addressBuilder.append("\n Billing Street: " + billingAddress);
        addressBuilder.append("\n Billing city: " + billingCity);
        addressBuilder.append("\n Billing state: " + billingState);
        addressBuilder.append("\n Billing zip: " + billingZip);
        addressBuilder.append("\n Shipping Street: " + shippingStreet);
        addressBuilder.append("\n Shipping City: " + shippingCity);
        addressBuilder.append("\n Shipping State: " + shippingState);
        addressBuilder.append("\n Shipping Zip: " + shippingZip);
// retrieve the underlying characters from
// the StringBuilder
        String finalAddressBuilder = addressBuilder.toString();
        System.out.println(finalAddressBuilder);
    }
}
