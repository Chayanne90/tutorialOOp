/*
* getter and setter are two conventional methods that are used for retrieving
* and updating value of a variable.
* using getter and setter, the programmer can control how his important variables are
* accessed and updated in a correct manner, such as changing value of a variable within
* a specified range.
*
*
*
* */


class Car {

    String model;
    int year;

    void carDetails(){
        System.out.println(model +" Is a new european, the car is "+ year);
    }

    int caryearlife(){
        int carlife = 2019 - year;
        return carlife;
    }
    // getter is a method that reads value of a variable
    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }
}

public class App1 {
    public static void main(String[] args) {

        Car bmw = new Car();
        bmw.model = "M5";
        bmw.year = 2019;
        //int carcurrentYears = bmw.caryearlife();
        //bmw.carDetails();
        //System.out.println("and has been a round by " + carcurrentYears);
        int year = bmw.year;
        String model = bmw.model;

        System.out.println("My car is a new " + model);
        System.out.println("Is a " + year+ " M5");


    }
}
