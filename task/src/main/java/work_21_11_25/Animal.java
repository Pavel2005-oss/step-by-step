package work_21_11_25;
/// protected(пример кошель)
public class Animal {

    protected String name;
    protected int age;
    protected double weight;

    public Animal(String newName, int age, double weight){

        this.name = newName;
        this.age = age;
        this.weight = weight;

        System.out.println("Create Animal");
    }

    public void eat(){
        System.out.println(name + " ест");
    }

    public void sleep(){
        System.out.println(name + " спит");
    }

    public void makeSound(){
        System.out.println(name + " издает звук");
    }

    public void displayName() {
        String info = "Животное:" +
                "Имя:'" + name + '\'' +
                ", Возраст:" + age +
                ", Вес: " + weight;

        System.out.println(info);
    }
}
