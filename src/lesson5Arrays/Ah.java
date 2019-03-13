package lesson5Arrays;

import java.util.Random;

public class Ah {

    int x [];
    int xx [][];
    int gn;

    public Ah (int lengthArr1)                           // constructor for one line array
    {
        x = new int [lengthArr1];
        Random generator = new Random();     //створюємо генератор випадкових чисел

        for (int i=0; i<lengthArr1; i++) {
            gn = generator.nextInt(10); // генерація випадкового числа від 0 до 10;
            x[i]= gn;
            System.out.print(x[i] +"\t");
        }

        System.out.println();
        System.out.println("Array is filled");
    }

    public Ah (int lengthArr1, int lengthArr2)     // constructor for two dimension line array
    {

        xx = new int[lengthArr2][lengthArr1];
        Random generator = new Random();     //створюємо генератор випадкових чисел

        System.out.println("New 2x matrix started");
        for (int i=0; i<lengthArr2; i++) {
            for (int j=0; j<lengthArr1; j++){
                gn = generator.nextInt(10); // генерація випадкового числа від 0 до 10;
                xx[i][j]= gn;
                System.out.print(xx[i][j] +"\t");
            }
            System.out.println();

        }

        System.out.println("Array is filled");

    }

    public Ah (int lengthArr1, int lengthArr2, int lengthArr3)
    {      // constructor for two dimension line and single array


        x = new int [lengthArr1];
        Random generator = new Random();     //створюємо генератор випадкових чисел

        for (int i=0; i<lengthArr1; i++) {
            gn = generator.nextInt(10); // генерація випадкового числа від 0 до 10;
            x[i]= gn;
            System.out.print(x[i] +"\t");
        }

        System.out.println();
        System.out.println("Array is filled");

        xx = new int[lengthArr2][lengthArr3];

        System.out.println("New 2x matrix started");
        for (int i=0; i<lengthArr2; i++) {
            for (int j=0; j<lengthArr3; j++){
                gn = generator.nextInt(10); // генерація випадкового числа від 0 до 10;
                xx[i][j]= gn;
                System.out.print(xx[i][j] +"\t");
            }
            System.out.println();

        }

        System.out.println("Array is filled");


    } // constructor of two types arrays


    public static void main(String[] args) {

        int l=5; // single line array length
        int ll=5; // double line array lines array.length = this figure
        int lll=4; // double line array rows

//        Ah arr1 = new Ah (l);
//        System.out.println(arr1.x [4]);
//
//        Ah arr2 = new Ah (l,l);
//        System.out.println(arr2.xx [4][4]);

        Ah arr3 = new Ah (l,ll,lll);

//        bubbleSort1(arr3.x);
        System.out.println("Bubble sort 2line activated");
        System.out.println("arr.length = "+arr3.xx.length);
        bubbleSort2(arr3.xx);


// i can use array.length. how to use array size????

        }
    static void bubbleSort1(int[] arr) {  // here it comes a problemm. How can I use an object from main method?
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    //swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        for (int i=0; i < arr.length; i++){
            System.out.print(arr[i] +"\t");
        }
        System.out.println();
        }

    static void bubbleSort2(int[][] arr) {   // here bubble sort method doesnt work
        int n = arr.length;
        int nn = arr[0].length;

        int temp = 0;
        for (int ii = 0; ii < n; ii++) {       // row
            for (int i = 0; i < nn; i++) {               // column
                for (int j = 1; j < (nn - i); j++) {     // exact place
                    if (arr[ii][j - 1] > arr[ii][j]) {
                        //swap elements
                        temp = arr[ii][j - 1];
                        arr[ii][j - 1] = arr[ii][j];
                        arr[ii][j] = temp;
                    }

                }

            }



        }

        for (int i2=0; i2 < n; i2++){
            for (int kk=0; kk < nn; kk++){
                System.out.print(arr[i2][kk]+"\t");
            }
            System.out.println();

        }
    }
}