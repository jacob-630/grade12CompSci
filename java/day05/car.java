package day05;

public class car {
    private String make;
    private String model;
    private int year;

    car() {

    }

    car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
        System.out.println(this.make + " " + this.model + " " + this.year);
    
    }

    // public static void startCar(){
    //     System.out.println("");
    // }

    // public static void turnOff(){
    //     System.out.println("");
    // };

    // public void setMake(String make){
    //    this.make = make;
    //    System.out.println("make: "+make);
    // };

    // public void setModel(String model){
    //     this.model = model;
    //     System.out.println("model: "+model);
    // };
    // public void setYear(int year){
    //     this.year = year;
    //     System.out.println("year: "+year);
    // };

    
}
