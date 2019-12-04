package test;

/*
*
*
* Here I'm testing how package work from the ocean packegae when the maim method is not in the same
* package as teh class.
*
* you also can do subclasses
*
*
we need to import the class from where the class in locate this is how: import name-package.name-class; or
if you want do it without worring about the class name and want to import everything from that package
you do it like this import name-package.*;
*
*/

import ocean.Fish;
import ocean.Person;
import ocean.test2.Car;

public class App {

    public static void main (String [ ] args ) {
        Fish fish1 = new Fish();
        Person p1 = new Person();
        Car c1 = new Car();
    }
}

