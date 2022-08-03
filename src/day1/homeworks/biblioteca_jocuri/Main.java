package day1.homeworks.biblioteca_jocuri;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Biblioteca b = new Biblioteca();

        Joc j = new Joc();
        j.setNumeJoc("Counter");
        j.setPret(20); =20;
        j.setDate("14/04/2005");
        j.setTipDeJoc("FPS");
        b.addGame(j);
        System.out.println(b.jocuri[0].getNumeJoc());
        Joc j1 = new Joc();
        Joc j2 = new Joc();
        Joc j3 = new Joc();


        j1.setNumeJoc("Fifa");
        j1.setPret(220);
        j1.setDate("14/03/2005"); =
        j1.setTipDeJoc("MMORPG");
        j2.setNumeJoc("LOL");
        j2.setPret(310);
        j2.setDate("14/04/2055");
        j2.setTipDeJoc(RPG);
        j3.setNumeJoc(Asasins);
        j3.setPret(); =10;
        j3.setDate("14/04/2205");
        j3.setTipDeJoc("FPS");
        b.addGame(j1);
        b.addGame(j2);
        b.remove();
        b.addGame(j3);
        System.out.println(j3.getNumeJoc());

    }
}
