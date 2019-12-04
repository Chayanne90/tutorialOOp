

class Person {

    //instance variable
    String name;
    int age;

    //Classes con contain
    //1.data
    //2.subroutines

    void speak(){
        System.out.println("Hello my name is: " + name + " and I'm " + age + " years old.");
    }
    void sayHi(){
        System.out.println("Hi " + name);
    }
}

public class App {

    public static void main(String [] args){

        Person person1 = new Person();
        person1.name = "Chayanne";
        person1.age = 32;
        person1.speak();
        person1.sayHi();

        Person person2 = new Person();
        person2.name = "Joel Lopez";
        person2.age = 20;
        person2.speak();
        //System.out.println(person2.name);
        //System.out.println(person2.age);
    }
}
