package work_03_04_2025.work;

public class Rectangle extends Shape {
    private double width;
    private double length;
    public Rectangle(double width, double length , String color) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public double  getArea() {
        return length * width;
    }
}
