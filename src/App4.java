
/*CONSTRUCTOR:is a special method that is used to initialize objects.
The constructor is called when an object of a class is created.
It can be used to set initial values for object attributes
Constructor don't have a return type!.
A contructor always have to by the same as the name of the class.

*
* */


class Machine {

    private String brand;
    private String code;
    private int year;

    //constructor without parameters.
    public Machine(){

        System.out.println("Constructor Running....");
    }

    //Constructor with parameters.
    public Machine(String brand){
        System.out.println("Second parameters Running.....");
        this.brand = brand;
    }

    public Machine(String brand, String code, int year){
        this.brand = brand;
        this.code = code;
        this.year = year;
    }


}

public class App4 {

    public static void main(String[] args) {
        //object created (a instance of the class Machine)
        Machine M1 = new Machine();

        Machine M2 = new Machine("Mercedez Benz");


    }
}
