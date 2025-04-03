package anlov.java;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println(isTrue(1, 3));
        System.out.println(isPol(0));
        System.out.println(checkNum(5));
        stringAndNum("Привет", 1);
        System.out.println(vis(1900));
        int[] mas = {1,0,0,0,1,1,1};
        System.out.println(Arrays.toString(massiv(mas)));
        System.out.println(Arrays.toString(newMassiv()));
        System.out.println(Arrays.toString(returnMassiv(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1})));
    }

    public static boolean isTrue(int a, int b) {
        return a + b < 21 && a + b >= 10;
    }

    public static String isPol(int num) {
        if (num >= 0) return "Число положительное";
        else return "Число отрицательное";
    }

    public static boolean checkNum(int a) {
        return a < 0;
    }

    public static void stringAndNum(String s, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(s);
        }
    }

    public static boolean vis(int year) {
        return ((year % 4 == 0 && year % 100 != 0)  || (year % 400 == 0));
    }

    public static int[] massiv(int[] massiv) {
        int i = 0;
        while (i < massiv.length) {
            if (massiv[i] == 1) {
                massiv[i] = 0;
            } else if (massiv[i] == 0) {
                massiv[i] = 1;
            }
            i++;
        }
        return massiv;
    }

    public static int[] newMassiv() {
        int[] massiv = new int[100];
        for(int i = 0; i < 100; i++) {
            massiv[i] = i+1;
        }
        return massiv;
    }

    public static int[] returnMassiv(int[] massiv) {
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] < 6) {
                massiv[i] *= 2;
            }
        }
        return massiv;
    }
}