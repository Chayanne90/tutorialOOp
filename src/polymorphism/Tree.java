package polymorphism;

public class Tree extends Plant {



    @Override
    public void growing() {
       System.out.println("Tree growing.....");
    }

    public void leavesFall(){
        System.out.println("leaves falling...");
    }
}
