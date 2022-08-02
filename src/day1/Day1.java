package day1;

import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {
//        System.out.println(5+8);
//        System.out.println("primul"+"curs");
//        System.out.println(5>8);
//        Integer x=6;
//        String nume="Andrei";
//        System.out.println(x+nume);


        //1
        Scanner scan = new Scanner(System.in);
        System.out.println("Introdu primul numar");
        int n1=scan.nextInt();
        System.out.println("Introdu al 2 lea numar");
        int n2=scan.nextInt();
       if(n1==n2){
           System.out.println("Sunt egale");
       }else{
           System.out.println("Nu sunt egale");
       }
       //2
        System.out.println("Introdu un numar");
       int div=scan.nextInt();
       if(div%3==0){
           System.out.println("divizibil cu 3");
       }else{
           System.out.println("nu este divizibil cu 3");
       }
       //3
        System.out.printf("Introdu varsta");
       int varsta=scan.nextInt();
       if(varsta>0 && varsta<100){
           System.out.println("Varsta corecta");
       }else{
           System.out.println("Varsta incorecta");
       }
       //4[PROFI]

        System.out.println("Introdu un numar");
       int nr=scan.nextInt();
        int nr_nou = 0;
        while(nr>0){
            nr_nou=nr_nou+nr%10;
            nr=nr/10;
        }
        System.out.println("nr:"+nr_nou);

    }
}
