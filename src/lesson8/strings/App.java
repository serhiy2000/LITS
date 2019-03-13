package lesson8.strings;

public class App {


    public static void main(String[] args) {
        String string = new String("loco");
        StringBuilder stringBuilder = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer();
//        System.out.println(string.charAt(3));
//        System.out.println(string.substring(1,3));

        String[] arr = new String[6];

        arr[0]="aaa";
        arr[1]="bbb";
        arr[2]="aaa";
        arr[3]="ddd";
        arr[4]="aaa";
        arr[5]="fff";

        System.out.println();


        String s1 = "";
        String s2 = "";
        for (String s : arr){
            if ("aaa".equals(s)){
                s1=s1.concat(s).concat(",");
            }else {
                s2 = s2.concat(s).concat(",");
            }
        }
        System.out.println("s1="+s1);
        System.out.println("s2="+s2);

        StringBuilder sent1 = new StringBuilder();
        System.out.println("setn1="+sent1);
        for (String s : arr){
            sent1.append(s).append(",");

        }
        System.out.println("sent1 final="+sent1);



    }




}




