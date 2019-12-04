package Inheritance;
/*
*
* The Class is the child class of the Machine, machine is the parent class.
* Now car class is identical of machine class.
*
* */
public class Car extends Machine {


    @Override
    public void start(){
        System.out.println("Car Starting...");
    }

    public void wipeWindshield() {

        System.out.println("Wiping Windshield...");
    }

    public void stop(){
        System.out.println("Car Stop...");
    }

}
