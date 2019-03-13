package lesson6extends;

public class Dog extends Animals {

    public Dog (String type, String name, int age) {
        this.type= type;
        this.name = name;
        this.age= age;
    }

    public Dog (String name, int age) {
        this.name = name;
        this.age= age;
    }

    public static void main(String[] args) {
        Dog dog = new Dog ("dog", "Doggie(aminals constr)", 5);
        Dog dogg = new Dog ("Doggie", 12);

        System.out.println("Dog.java : Dog's from name is:" + dog.name + ". Dog's age is: " + dog.age); // ???? не визиває поле мурчика
        System.out.println("Dog.java : Dog's from name is:" + dogg.name + ". Dog's age is: " + dogg.age); // ???? не визиває поле мурчика

    }
}
