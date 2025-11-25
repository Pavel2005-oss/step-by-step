package work_21_11_25;

public class Cat extends Animal{
    private boolean isHome;

    public Cat(boolean isHome, String name, int age, double weight){

        super(name,age ,weight);
        this.isHome = isHome;
        System.out.println("Кошка создана");
    }
    public void makeSound() {
        System.out.println(name + "мяукает");

    }

    @Override
    public void displayName() {
        super.displayName();
        if (isHome){
            System.out.println("Домашняя: Да");
        }else {
            System.out.println("Домашняя: Нет");
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "isHome=" + isHome +
                '}';
    }
}
