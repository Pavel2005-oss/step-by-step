package April.апрель.work_03_04_2025;

public class Vehicle {

    protected String color;
    protected int speed;

    public Vehicle(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    public void move(){
        System.out.println(" Vehicle move");
    }

}
