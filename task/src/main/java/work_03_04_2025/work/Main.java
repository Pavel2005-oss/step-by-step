package work_03_04_2025.work;

public class Main {
    public static void main(String[] args) {

        Shape circle =  new Circle("red", 10);
        Shape rectangle = new Rectangle( 2,4, "red");

        System.out.println(circle.getArea());
        circle.printColor();


        System.out.println(rectangle.getArea());
        rectangle.printColor();


    }
}
