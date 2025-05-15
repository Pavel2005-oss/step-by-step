package April.апрель.work_03_04_2025;

public abstract class Animal {

    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println(name + " is eating");
    }

    public abstract void makeSound();
}
