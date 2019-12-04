
/*
* setters and the THIS KEYBORAD.
* a setter is a method that updates value of a variable.
*
*THIS keyboard. is a reference variable in Java that refers to the current object.
The various usages of 'THIS' keyword in Java are as follows:
It can be used to refer instance variable of current class
It can be used to invoke or initiate current class constructor
It can be passed as an argument in the method call
It can be passed as argument in the constructor call
It can be used to return the current class instance
*
* */

class Frong {
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age ;
    }

    //Getters
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}
public class App2 {

    public static void main(String[] args) {

        Frong f1 = new Frong();
        //f1.name = "Bod";
        //f1.age = 23;
        f1.setName("Chayanne");
        f1.setAge(29);

        System.out.println(f1.getName());
        System.out.println(f1.getAge());
    }
}
