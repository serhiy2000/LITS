package lesson6implementss;

public class Apple extends Application implements OS {
    @Override
    public void getName() {
        System.out.println("I'm an aPPLE.");
    }

    @Override
    public void getBit() {
        System.out.println("I'm 32-bit only.");

    }

    @Override
    public void getUser() {
        System.out.println("User is the same: loco");

    }
}
