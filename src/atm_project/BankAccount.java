package atm_project;

import java.util.HashMap;

public class BankAccount extends Customer {


    /*Instance Variables*/
    public double balance = 500.00;
    //Create a HashMap as an Instance variable so I can have access from the ATM class
    static HashMap<Integer, String> customerCard = new HashMap<>();
    static HashMap<Integer, Integer> customerPin = new HashMap<>();

    /*Constructor*/
    public BankAccount(int cardNumber, int pin) {

        super(cardNumber, pin);
    }

    /*Methods
    This method take an amount and will return the deference of the balance if customer withdraw.
    */
    public void withdraw(double amount){

        balance = balance - amount;
    }

    //This method take an amount and will return the total balance when customer make a deposit
    public void deposit( double amount) {
        balance =  balance + amount;
    }




    /*Collecting the card assigned to the customer*/
    public static HashMap<Integer, String> getCustomerCard() {

        customerCard.put(4578, "Javier Paulino");
        customerCard.put(1004, "Jason Toledo");
        customerCard.put(2005, "Arlene Paulino");
        customerCard.put(4575, "Carmen Jerez");
        customerCard.put(1001, "Michael Jordan");
        return customerCard;
    }

    /*Collecting the card pin*/
    public static HashMap<Integer, Integer> getCustomerPin() {

        customerPin.put(4578, 2534);
        customerPin.put(1004, 1234);
        customerPin.put(2005, 1980);
        customerPin.put(4575, 2298);
        customerPin.put(1001, 1230);
        return customerPin;
    }

































}
