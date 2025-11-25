package work_21_11_25;

public class Dog extends Animal{

    private String breed;

    public Dog(String newName, int age, double weight, String breed) {
        super(newName, age, weight);
        this.breed = breed;

        System.out.println("Create Dog");
    }

    public void makeSound(){
        System.out.println(name + " гавкает");
    }


    public void displayName() {
        super.displayName();
        System.out.println( ", Порода: " + breed);
    }
}
