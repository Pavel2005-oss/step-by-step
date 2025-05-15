package March.март.work_06_03_25;

public class Lesson {

    public static void main(String[] args) {

        MyClass myClass = new MyClass();
        myClass.number = 100;
        myClass.string = "myClass";
        myClass.print();

        System.out.println(myClass.string);

        MyClass myClassSecond = new MyClass(666, "myClassSecond");
        System.out.println(myClassSecond.string);
    }
}


