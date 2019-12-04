package atm_project;

public abstract class Customer {

    private String name;
    private int cardNumber;
    private int pin;

    //constructor
    public Customer(int cardNumber, int pin) {

        this.cardNumber = cardNumber;
        this.pin = pin;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    //getter
    public String getName() {
        return name;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public int getPin() {
        return pin;
    }

}
