package work_03_04_2025;

public class Car extends Vehicle{
    private String brand;

    public Car(String color, int speed, String brand) {
        super(color, speed);
        this.brand = brand;
    }

    public void move(){
        System.out.println("Car move");
    }

}
