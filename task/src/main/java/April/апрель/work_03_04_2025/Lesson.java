package April.апрель.work_03_04_2025;

public class Lesson {

    /*
    1) public
    2) private
    3) protected
    4) default
     */

    public static void main(String[] args) {

//        Person person = new Person();
//        person.setAge(10);
//        person.setName("Name");
        Person person = new Person("Name", 10);

        Car car = new Car("black", 100, "kia");
        car.move();
    }

}
