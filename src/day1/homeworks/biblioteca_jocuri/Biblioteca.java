package day1.homeworks.biblioteca_jocuri;

import com.sun.security.jgss.GSSUtil;
import com.sun.source.tree.TryTree;

public class Biblioteca {
    Joc[] jocuri = new Joc[2];
    String nume;


    void addGame(Joc j) {
        boolean liber = false;

        for (int i = 0; i < jocuri.length; i++) {
            try {
                if (jocuri[i].numeJoc.equals(j.numeJoc)) {
                    System.out.println("This game already exists");
                    liber = true;
                    break;
                }

            } catch (NullPointerException e) {

            }
            if (jocuri[i] == null) {
                jocuri[i] = j;
                System.out.println("added");
                liber = true;
                break;
            }
        }
        if (!liber) {
            Joc[] temp = new Joc[jocuri.length * 2];
            for (int i = 0; i < jocuri.length; i++) {
                temp[i] = jocuri[i];
            }
            jocuri = temp;

        }

    }

    void remove(String gameRemover) {
        for (int i = 0; i < jocuri.length; i++) {
            if (gameRemover.equals(jocuri[i].numeJoc)) {
                jocuri[i] = null;
                System.out.println("removed");
                break;
            }

            if (!gameRemover.equals(jocuri[i].numeJoc)) {
                System.out.println("game was not found");

            }

        }
    }


}
/*
   try {
                if (j.numeJoc.equals(jocuri[i].numeJoc))
                    System.out.println("This game already exists");

            } catch (Exception e) {

                if (jocuri[i] == null) {
                    jocuri[i] = j;
                    System.out.println("added");
                    liber = true;

                }
                if (liber == false) {
                    System.out.println("Nu exista sloturi libere");
                }
              break;

            }
 */


/*
if (jocuri[i] == null) {
                    jocuri[i] = j;
                    System.out.println("added");
                    liber = true;
                    break;
                }





        }
        if (!liber) {
            System.out.println("Nu exista sloturi libere");
        }
 */