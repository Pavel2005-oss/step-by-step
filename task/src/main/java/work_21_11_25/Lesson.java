package work_21_11_25;
/*
ООП
наследование "И с Э"

 */
public class Lesson {

    public static void main (String[] args) {
        Animal cat = new Cat(true, "Кошка", 19, 3 );
        Animal dog = new Dog("Собака", 3, 9, "були");
        cat.displayName();
        dog.displayName();
    }

}
