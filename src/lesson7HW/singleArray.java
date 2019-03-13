package lesson7HW;

import java.util.Arrays;
import java.util.Random;

public class singleArray { // close to zero

    int gn;
    int x [];
    int xx [][];

    public singleArray(int i) {
    }

    public singleArray(int lengthArr1, int lengthArr2)     // constructor for two dimension line array
    {

        xx = new int[lengthArr2][lengthArr1];
        Random generator = new Random();     //створюємо генератор випадкових чисел

        System.out.println("New 2x matrix started");
        for (int i = 0; i < lengthArr2; i++) {
            for (int j = 0; j < lengthArr1; j++) {
                gn = generator.nextInt(5); // генерація випадкового числа від 0 до 10;
                xx[i][j] = gn;
                System.out.print(xx[i][j] + "\t");
            }
            System.out.println();

        }

        System.out.println("Array is filled");
    }


    public static void main(String[] args) {
        int x [] = new int [] {-59,-101,28,5,82};
        System.out.println("My initial array is: "+Arrays.toString(x));

        // no.1,2 number close to ZERO
        int close=Math.abs(x[0]);
        int closeIndex=0;

        for (int i=0; i<x.length-1; i++)
            if (Math.abs(x[i]) < close) {
                close = x[i];
                closeIndex = i;
            }
        System.out.println("Close to Zero is: "+close+". Position in Array: no. "+closeIndex);

        // no.3. find sum of min and max in array
        Arrays.sort(x, 0, x.length-1);
        System.out.println("Sorted array: "+Arrays.toString(x));
        System.out.println("Sum of the minimal ("+ x[0]+") and maximal value ("+x[x.length-1]+") = "+(x[0]+x[x.length-1]));

        // ================================================
        // sum figures

        int sum = 0;
        int pos = 0;

        for (int i=0; i<x.length;i++){
            int k = Math.abs (x[i]); int x2 =k;
            int s = 0;
            while (x2 != 0 ){
                s +=x2%10;
                x2 /=10;
//                System.out.print(x[i]+"-"+s);
//                System.out.println();
            }
            if (Math.abs(s)>sum){
                sum = Math.abs(s);
                pos = i;
            }
        }

        System.out.println("Maximal sum of the figures in Array is: "+sum+". Position in SORTED array is: "+pos);


        singleArray doubleX = new singleArray(2,3);

        // maximal sum in the row
        int col=0, sumC=0, sumColumn=0;
        int row=0, sumR=0, sumRow=0;

        for (int i=0; i<doubleX.xx.length; i++){ // row
            sumR=0;

            for (int j=0; j<doubleX.xx[0].length; j++){
                sumR = sumR+doubleX.xx[i][j];
                System.out.print(sumR+";");
                row = row++;
            }
            if (sumR>sumRow) {
                sumRow=sumR;
                row=i+1;
            }
            System.out.println();
        }
        System.out.println("Maximal row no. "+row+" sum is "+sumRow);

        for (int j=0; j<doubleX.xx[0].length; j++){ // column
            sumC=0;

            for (int i=0; i<doubleX.xx.length; i++){
                sumC = sumC+doubleX.xx[i][j];
                System.out.print(sumC+";");
                col = col++;
            }
            if (j == 0){
                sumColumn=sumC;
            }


            if (sumC<=sumColumn) {
                sumColumn=sumC;
                col=j+1;
            }
            System.out.println();
        }
        System.out.println("Minimal column no. "+col+" sum is "+sumColumn);

    }

}
