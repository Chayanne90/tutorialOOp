package Inheritance;

/*
* Introduction to Inheritance
*
*
*/
public class App {
    public static void main(String[] args) {

        Machine machine1 = new Machine();
        //machine1.start();
        //machine1.stop();

        Car c1 = new Car();

        c1.start();
        c1.wipeWindshield();
        c1.stop();
    }
}
