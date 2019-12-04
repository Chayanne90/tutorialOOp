
/*
STATIC KEYWORD: are also known as class variable
also you can have static methods.
* FINAL KEYWORD:
* */

class Thing {

    public int number;
    public final static int number2 = 100;

    public static int count = 0;
    public int id;

    public String name;
    public static String description;


    public Thing() {

        id = count;
        count++;
    }

    public static void showInfo() {
        System.out.println(description);
    }

    public void showName(){
        System.out.println("object ID:" +" "+ id + description + " : " + name);
    }

    public void setNumber(int number){
        this.number = number;
    }

    public int getNumber(){
        return number;
    }
}

public class App5 {

    public static void main(String[] args) {

        //static variable
        Thing.description = "Hello your name is : ";

        System.out.println("Before creating the objects, the value if count is : " + Thing.count);

        //creating the objects
        Thing t1 = new Thing();
        Thing t2 = new Thing();

        System.out.println("After creating the object the value of count is: " + Thing.count);

        t1.name = "Erick";
        t2.name = "Chayanne";
        t1.setNumber(200);

        System.out.println(t1.getNumber());
        System.out.println(Thing.number2);
        t1.showName();
        t2.showName();

    }
}
