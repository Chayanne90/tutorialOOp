package practice_oop;

public class App {
    public static void main(String[] args) {

        Car car1 = new Car("Toyota", "Camry", 2019);

        System.out.println("The car you pick: " + car1.getBrand());


        int horsepower = car1.horsepower(2595,904);

        System.out.println("The Car horse power is : " + horsepower);

    }
}

