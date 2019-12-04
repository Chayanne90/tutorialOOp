package public_private_protected;

public class Plant {

    //bad practice to set the instance varaible.
    // it's a good pratice to have them private.
    public String name;

    private String type;

    protected String size;

    // this is good practice ID is a constant variable but i cant be change!
    public final static int ID = 52;

    public  Plant() {

        this.type = "Plant";

        this.size = "large";

        this.name = "Chayanne";

    }



}
