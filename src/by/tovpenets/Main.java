package by.tovpenets;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("привет, как тебя зовут?");

        String name = scanner.nextLine();

        System.out.println("приятно познакомиться, " + name);




        System.out.println("hello world");
        byte  byteVar =127;
        long longVar =100;
        char charVar ='a';
        double doubleVar=2.9;
        boolean bootVar =true;
        int intVar = byteVar;
        int intVar2 =(int) longVar;

        int a =10;
        int b =12;
        System.out.println("a + b = " + (a + b));
        System.out.println( "a - b = "+ (a - b));
        System.out.println( "a * b = " + (a * b));


        System.out.println("1 & 1 = "+ (1 & 1));
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
}
