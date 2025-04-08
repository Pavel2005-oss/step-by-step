package work_03_04_2025.work;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius){
        super(color); // вызыв констр род класаа (параметор)
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * (radius * radius);
    }
}
