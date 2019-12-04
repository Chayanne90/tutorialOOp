/**
 * toString method
 */


class Turtle {

    /**/
    private String name;
    private int id;

    // CONSTRUCTOR
    public Turtle(int id , String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {

        //string format
        return String.format("%-5d: %s", id , name);

        /* this is better way to concadenate.
        StringBuilder sb = new StringBuilder();
        sb.append(id).append(":").append(name);
        return sb.toString();*/

        /* this no be efficiente way
        return id +" : "+ name;*/
    }
}

public class App6 {

    public static void main(String [] args){

        Turtle t1 = new Turtle(10, "Chayanne");
        Turtle t2 = new Turtle(11, "Carla");
        Turtle t3 = new Turtle(12, "Magic");
        Turtle t4 = new Turtle(13, "John");

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);

    }
}
