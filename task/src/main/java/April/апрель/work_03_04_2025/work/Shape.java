package April.апрель.work_03_04_2025.work;

public abstract class Shape  {
    protected String color;

    public Shape (String color){
        this.color = color;
    }

    public abstract double getArea();

    public void printColor(){
        System.out.println(color);
    }
}
