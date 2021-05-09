
import java.lang.*;
import java.util.*;

class Customer {
    private String name;
    private Vector rentals = new Vector();
    public Customer (String customerName){
        name = customerName;
    };
    public void addRental(Rental rentedMovie) {
        rentals.addElement(rentedMovie);
    };
    public String getName (){
        return name;
    };
    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration enum_rentals = rentals.elements();	    
        String rentalRecord = "Rental Record for " + this.getName() + "\n";
        rentalRecord += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";

        while (enum_rentals.hasMoreElements()) {
            double thisAmount = 0;
            Rental each = (Rental) enum_rentals.nextElement();
            //determine amounts for each line
            thisAmount = amountFor(each);
            // add frequent renter points
            frequentRenterPoints ++;
            // add bonus for a two day new release rental
            if ((each.getMovie().getPrice() == Movie.NEW_RELEASE) && each.getDaysRented() > 1) 
                frequentRenterPoints ++;
            //show figures for this rental
            rentalRecord += "\t" + each.getMovie().getTitle()+ "\t" + "\t" + each.getDaysRented() + "\t" + String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;
        }
        //add footer lines
        rentalRecord += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        rentalRecord += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
        return rentalRecord;
    }

   private double amountFor(Rental aRental) {
	   return aRental.getCharge();
   }

}
    