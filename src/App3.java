
/*Method in OOP*/

class Robot {

    public void speak(String str){
        System.out.println("Hello " + str);
    }

    public void jump(int distance){
        System.out.println("Jump: " + distance);
    }

    public void move (String diraction, double distance){
        System.out.println("Moving: " + diraction + "meter in distance: " + distance);
    }
}


public class App3 {

    public static void main (String [ ] args) {

        Robot robot1 = new Robot();
        robot1.speak("I am Chayanne");

        robot1.jump(10);
        robot1.move("left", 89.0);
    }
}
