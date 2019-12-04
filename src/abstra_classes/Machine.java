package abstra_classes;

//this is an abstract class....
public abstract class Machine {

    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    //abstract method...
    public abstract void start();
    public abstract void stuff();
    public abstract void shutdown();


    public void run(){
        start();
        stuff();
        shutdown();
    }




}
