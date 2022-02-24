package by.tovpenets;


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("привет, как тебя зовут?");

        String name = scanner.nextLine();

        System.out.println("приятно познакомиться, " + name);


        System.out.println("hello world");
        byte byteVar = 127;
        long longVar = 100;
        char charVar = 'a';
        double doubleVar = 2.9;
        boolean bootVar = true;
        int intVar = byteVar;
        int intVar2 = (int) longVar;

        int a = 10;
        int b = 12;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));


        System.out.println("1 & 1 = " + (1 & 1));
        System.out.println("1 | 1 = " + (1 | 2));
        System.out.println("1 ^ 1 = " + (1 ^ 2));
        System.out.println(" ~1 " + (~1));

        System.out.println((1 == 1) && (2 == 2));
        System.out.println((2 == 1) && (1 == 1));
        System.out.println((1 == 1) || (2 == 2));
        System.out.println((2 == 1) || (2 == 1));

        System.out.println(!(1 == 1));
        System.out.println(!(1 == 2));

        int c = 10;
        c += 5;
        System.out.println(c);
        c -= 3;
        System.out.println(c);
        c *= 2;
        System.out.println(c);
        c /= 2;
        System.out.println(c);

        int d = (c < a) ? 1 : 0;
        System.out.println(d);




    }

  //      1. написать игру камень ножницы бумага.
/*                0.бесконечный цикл.
                1. сопостовляем значение к н б .
                2. сказать игроку порядок действий.
                3. значение переменной из ввода.
                4. рандом.
                5. проверить правильность ввода числа.
                6. проверка выхода из программы.
                7. сама игра.*/



    public static void main(String[] args){
    int[] digits = {0, 1, 4, 3, 10, -1};
        System.out.println(Arrays.toString(digits);
        Arrays.toString(digits);
        System.out.println(Arrays.toString(digits));
    int position = Arrays.toString(digits, key: 10);
        System.out.println(digits[position] == 10);
    int[] destinationArray = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,};
        System.arraycopy(digits, srcPos: 1, destinationArray, destPost: 2, );
        System.out.println(Arrays . tos4String(destinationArray));


    int[] swap ={2, 1};
    int temp;
        System.out.println(ArrayString(swap));
    temp = swap[0];
    swap[1] = swap[0];
    swap[0] = temp;
        System.out.println(Arrays.toString(swap));


    int func(){
        return func();


        int[] quicksotrt(int[] arr. int low, int high){
            if(arr.length <2){
                return arr;
            }
                ...
            quicksort(arr1,_);
            quicksotrt(arr2,_);
            }


    }

        {






    }
}
