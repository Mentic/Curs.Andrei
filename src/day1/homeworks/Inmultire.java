package day1.homeworks;

import java.util.Scanner;

public class Inmultire {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.print(N + "x" + i + "="+ N * i);
            System.out.println("");

        }
    }
}
