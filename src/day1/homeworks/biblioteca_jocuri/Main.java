package day1.homeworks.biblioteca_jocuri;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Biblioteca b = new Biblioteca();

        Joc j = new Joc();
        j.numeJoc = "Counter";
        j.pret = 20;
        j.date = "14/04/2005";
        j.tipDeJoc = "FPS";
        b.addGame(j);
        System.out.println(b.jocuri[0].numeJoc);
        Joc j1 = new Joc();
        Joc j2 = new Joc();
        Joc j3 = new Joc();


        j1.numeJoc = "Fifa";
        j1.pret = 220;
        j1.date = "14/03/2005";
        j1.tipDeJoc = "MMORPG";
        j2.numeJoc = "LOL";
        j2.pret = 310;
        j2.date = "14/04/2055";
        j2.tipDeJoc = "RPG";
        j3.numeJoc = "Asasins";
        j3.pret = 10;
        j3.date = "14/04/2205";
        j3.tipDeJoc = "FPS";
        b.addGame(j1);
        b.addGame(j2);
        b.remove();
        b.addGame(j3);
        System.out.println(j3.numeJoc);

    }
}
