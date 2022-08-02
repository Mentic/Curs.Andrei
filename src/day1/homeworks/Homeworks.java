package day1.homeworks;


import java.util.Scanner;

public class Homeworks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = {5, 7, 8};
        int[] b = {6, 5
        };
        boolean check = false;
        if (a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] == b[i]) {
                    check = true;
                }
            }
        }
        if (check) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }

        //2

        int n = scan.nextInt();
        int[] v = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean equal = false;
        for (int i = 0; i < v.length; i++) {
            if (v[i] == n) {
                equal = true;
            }
        }
        if (equal == true) {
            System.out.println("Numarul introdus apartine sirului");
        } else {
            System.out.println("Numarul introdus nu apartine sirului");
        }

        //Robotel

        String x1 = "Ana";
        String y1 = " are mere";
        System.out.println(Concatenare(x1,y1));

    }

    static String Concatenare(String x, String y) {
        String Concatenat = x + y;
        return Concatenat;
    }


}



