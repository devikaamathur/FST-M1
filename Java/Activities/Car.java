package activities;

public class Car {

    int carTyres;
    int carDoors;
    static void displayCharacteristics() {
        System.out.println("I just got executed!");
    }

    static void accelerate() {
        System.out.println("Car is moving forward.");
    }

    static void brake() {
        System.out.println("Car has stopped.");
    }
    public Car(int tyres, int doors) {
        carTyres = tyres;
        carDoors = doors;
    }

    public static void main(String[] args) {
        String color = "Black";
        String transmission = "Electric";
        int make = 2022;

        System.out.println(color);
        System.out.println(transmission);
        System.out.println(make);

        Car obj = new Car(4,4);
        System.out.println(obj.carTyres);
        System.out.println(obj.carDoors);
    }

}
