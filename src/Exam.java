public class Exam {
    public static void main(String[] args) {


        System.out.println("Question 1");
        int s =0;
        int k=0;
        do {
            s += 2;

        } while (s !=100);
        System.out.println(s);

//        for (short i = 32766; i<=32767; i=i+1){
//            System.out.println("i "+i);
//            System.out.println();
//        }; // question 4 - compile error

        System.out.println("Question 5.");
        short i = 32766;
        do {
            System.out.println("i="+i);
            i++;
        } while (i<32767);  // question. 5 - will go one iteration.

        // question 6 = answer "3".
        System.out.println("\nQuestion 6");
        boolean a= true;
        boolean b = false;
        boolean c = true;

        if (a ==true){
            if (b==true){
                if (c==true){
                    System.out.println("1");
                } else System.out.println("2");
            }else  if (a&&(b=c)){
                System.out.println("3");
            } else {
                System.out.println("4");
            }
        }


    }

}
