package atm_project;

import java.util.HashMap;
import java.util.Scanner;

public class Atm extends BankAccount {


    public Atm(int cardNumber, int pin) {
        super(cardNumber, pin);
    }

    public static void main(String[] args) {

        String checkcardNum ;
        String customerName;
        String checkpin;
        int selectOptions;
        double deposit;
        double withdrawal;
        boolean validateCard;
        boolean valdiatePin;

        // user input
        Scanner in = new Scanner(System.in);

        while(true) {
            System.out.println("ATM system running.....");
            System.out.println(" ");
            System.out.println("Welcome to National Bank ATM");
            System.out.println("Please insert card number: ");

            checkcardNum = in.nextLine();
            System.out.println("Please insert your pin: ");
            checkpin = in.nextLine();

            if (checkcardNum.isEmpty() || checkpin.isEmpty()) {


                System.out.println("You need to enter your card number and Pin please please!");
                checkcardNum = in.nextLine();
                checkpin = in.nextLine();


            } else {

                /*in this step user have enter their credentials*/
                int cardNum = Integer.parseInt(checkcardNum);
                int pin = Integer.parseInt(checkpin);
                BankAccount client = new BankAccount(cardNum, pin);

                //Here I'm checking if the card exists in the bank's records
                validateCard = getCustomerCard().containsKey(client.getCardNumber());
                customerName = getCustomerCard().get(client.getCardNumber());

                //System.out.println("The card is in the bank records:  " + validateCard);

                /* If its true that card exists give the client the atm functionality.*/
                
                System.out.println("Welcome: " + customerName);
                System.out.println("1 - Check balance " + "     " + " 2 - Deposit");
                System.out.println(" ");
                System.out.println("3 - Withdrawal " + "     " + " 4 - $50 Fast Cash");
                System.out.println(" ");
                System.out.println("5 - Cancel");

                selectOptions = in.nextInt();

                if (selectOptions == 1) {
                    System.out.println("Your balance is: " + client.balance);
                    break;
                } else if (selectOptions == 2) {

                    System.out.println("How much you to deposit: ");
                    deposit = in.nextDouble();
                    client.deposit(deposit);

                    System.out.println(" ");
                    System.out.println("Your total balance is:  " + client.balance);

                    break;
                } else if (selectOptions == 3) {

                    System.out.println("How much you to Withdrawal: ");
                    withdrawal = in.nextDouble();
                    client.withdraw(withdrawal);

                    System.out.println(" ");
                    System.out.println("Your total balance is:  " + client.balance);

                    break;
                } else if (selectOptions == 4) {


                    client.withdraw(50);
                    System.out.println("Your total balance is:  " + client.balance);


                } else if(selectOptions == 5){
                    System.out.println("Canceling transtions......");
                    break;
                }


            }
        }
    }
}
