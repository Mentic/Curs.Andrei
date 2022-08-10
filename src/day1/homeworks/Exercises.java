package day1.homeworks;


import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //1
        int[] v = {5, 8, 2, 3};
        int temp;
        for (int i = 0; i < v.length; i++) {
            for (int j = i; j < v.length; j++) {
                if (v[i] > v[j]) {
                    temp = v[i];
                    v[i] = v[j];
                    v[j] = temp;
                }
            }
        }
        for (int a : v) {
            System.out.println(a);

        }
//        //2
//        System.out.println("ex2:");
//        int[] a = {1, 3, 5, 7};
//        int[] b = {2, 4, 6, 8};
//        int[] x = new int[a.length + b.length];
//        for (int i = 0; i < a.length; i++) {
//
//        }
//        for (int y : x) {
//            System.out.println(y);
//
//        }
        //3
        System.out.println("ex3:");
        int[] c={1,4,7,3,8};
        int c1Size=0;
        for(int i = 0; i <c.length;i++){
            if(c[i]%2!=0){
                c1Size++;
            }
        }
        int odd=0;
        int[] c1=new int[c1Size];
        for (int i = 0; i < c.length; i++) {
            if(c[i]%2!=0){
                c1[odd]=c[i];
                odd++;
            }

        }
        for (int p:c1) {
            System.out.println(p);

        }
    }
}