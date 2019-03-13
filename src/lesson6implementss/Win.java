package lesson6implementss;

public class Win extends Application implements OS  {
    @Override
    public void getName() {

        getName = "Win";
        System.out.println("hi from win");
            }

    @Override
    public void getBit() {
        System.out.println("I'm 36x bit.");

    }

    @Override
    public void getUser() {
        System.out.println("User: loco.");

    }

    }

