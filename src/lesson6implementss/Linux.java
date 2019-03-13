package lesson6implementss;

public class Linux extends Application implements OS {
    @Override
    public void getName() {
        System.out.println("This is Linux!");
    }

    @Override
    public void getBit() {
        System.out.println("It's 64 x bit.");

    }

    @Override
    public void getUser() {
        System.out.println("User the same. loco.");

    }
}
