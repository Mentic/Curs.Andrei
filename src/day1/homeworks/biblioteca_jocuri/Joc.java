package day1.homeworks.biblioteca_jocuri;

import java.util.Scanner;

public class Joc {
     private String numeJoc;
    private Integer pret;
    private String date;
    private String tipDeJoc;
    private static String[] posibilTipDeJoc={"FPS","RPG","MMORPG"};
    public String getNumeJoc() {
        return numeJoc;
    }

    public void setNumeJoc(String numeJoc) {
        this.numeJoc = numeJoc;
    }

    public Integer getPret() {
        return pret;
    }

    public void setPret(Integer pret) {
        this.pret = pret;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTipDeJoc() {
        return tipDeJoc;
    }

    void setTipDeJoc(String typeOfGame) {
        boolean check = false;
        while (!check){
            for (String tdjiterator : posibilTipDeJoc) {
                if (typeOfGame.equals(tdjiterator)) {
                    tipDeJoc = typeOfGame;
                    check=true;
                    break;
                }

            }
            if(check){
                break;
            }
            Scanner scan=new Scanner(System.in);
            System.out.println("Reintrodu tipul de joc:");
            String type=scan.nextLine();
            typeOfGame=type;
    }


    }
    /*
     System.out.println("Introdu tipul de joc:");
        String type=scan.nextLine();
     */
    public static String[] getPosibilTipDeJoc() {
        return posibilTipDeJoc;
    }

    public static void setPosibilTipDeJoc(String[] posibilTipDeJoc) {
        Joc.posibilTipDeJoc = posibilTipDeJoc;
    }







}




