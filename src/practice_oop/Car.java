package practice_oop;

public class Car implements CarSpecs{

    private String brand;
    private int year;
    private String model;


    // contructor
    public Car(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;

    }

    //setters
    public void setBrand( String brand) {
        this.brand = brand;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void  setYear(int year){
        this.year = year;
    }

    //getters
    public String getBrand() {
        return brand;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }

    //methods
    @Override
    public int horsepower(int rpm, int t) {
        return (rpm * t)/5262;
    }

}
