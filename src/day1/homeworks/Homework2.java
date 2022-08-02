package day1.homeworks;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] v = {{3, 4, 7, 8}, {10, 12, 14, 20}, {2, 3, 3, 4}, {12, 3, 34, 4}};
        //matrice
        System.out.println("matrice:");
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                System.out.print(v[i][j] + " ");
            }
            System.out.println("");
        }


        //principala
        System.out.println("principala:");
        for (int i = 0; i < v.length; i++) {
            int j = i;
            System.out.println(v[i][j]);

        }
        System.out.println("secundara:");
        //secundara
        int j = 0;
        for (int i = v.length - 1; i >= 0; i--) {

            System.out.println(v[i][j]);
            j++;

        }
        //deasupra diagonalei
        System.out.println("deasupra:");

        for (int i = 0; i < v.length; i++) {
            for (int jd = i + 1; jd < v[i].length; jd++) {
                System.out.print(v[i][jd] + " ");

            }
            System.out.println(" ");
        }
        //sub diagonala
        System.out.println("sub:");
        for (int i = 1; i < v.length; i++) {
            for (int js = 0; js < i; js++) {
                System.out.print(v[i][js] + " ");
            }
            System.out.println(" ");
        }

        //persoane
        System.out.println("persoane:");
        Person[] people = new Person[4];
        Person p = new Person();
        people[0] = p;
        p.nota = 8;
        p.nume = "Costel";

        Person p1 = new Person();
        people[1] = p1;
        p1.nota = 8;
        p1.nume = "Ion";
        Person p2 = new Person();
        people[2] = p2;
        p2.nota = 9;
        p2.nume = "Andrei";
        Person p3 = new Person();
        people[3] = p3;
        p3.nota = 6;
        p3.nume = "George";
        boolean check = false;
        String unNume = scan.nextLine();
        for (int i = 0; i < people.length; i++) {
            if (unNume.equals(people[i].nume)) {
                System.out.println(people[i].nota);
                check = true;
            }
        }
        if (!(check)) {
            System.out.println("This student was not found");
        }
        //Try/catch
        System.out.printf("Try/catch:");
        System.out.println(" ");
        try {
            for (int i = 0; i < people.length; i++) {
                if (unNume.equals(people[i].nume)) {
                    System.out.println("Elevul: " + people[i].nume);
                    System.out.println("Are nota: " + people[i].nota);
                }
            }
        } catch (NullPointerException e) {
            System.out.println("Eroare");
        }

    }
}