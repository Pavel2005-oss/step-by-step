package March.март.work_06_03_25;

public class Method {

    public static void main(String[] args) {
        sayHello("Вася", 20);
        sayHello("Аня", 10);

        int value = getValue(); // int ten = 10;

        System.out.println(add(div(multi(100))));
    }


    public static int add(int a){
        return a+20;
    }
    public static int div(int a){
        return a/2;
    }
    public static int multi(int a){
        return a*5;
    }
    public static int loop(){
        for (int i = 0; i < 10; i++) {
            if(i == 5){
                return i;
//                break;
            }
        }
        return 10;
    }
    public static int getValue(){
        int a = 5;
        int b = 10;
        if (a < b){
            return a;
        }

        return b;
    }

    public static void sayHello(String name, int age){
        System.out.println("Привет " + name);
    }

    // Так делать НЕЛЬЗЯ
    public static void sayHelloVasay(){
        System.out.println("Привет Вася");
    }
    public static void sayHelloAnn(){
        System.out.println("Привет Аня");
    }
    public static void sayHelloPeter(){
        System.out.println("Привет Петя");
    }

}
