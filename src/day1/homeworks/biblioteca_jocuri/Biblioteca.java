package day1.homeworks.biblioteca_jocuri;


public class Biblioteca {
    Joc[] jocuri = new Joc[2];
    String nume;

    void addGame(Joc j) {

        for (int i = 0; i < jocuri.length; i++) {
            if (jocuri[i] != null) {
                if (i == jocuri.length) {
                    System.out.println("Building a new library");
                    Joc[] temp = new Joc[jocuri.length * 2];
                    for (int k = 0; k < jocuri.length; k++) {
                        temp[k] = jocuri[k];
                    }
                    jocuri = temp;
                } else {
                    if (jocuri[i].getNumeJoc().equals(j.getNumeJoc())) {
                        System.out.println("This game already exists");
                        break;

                    }
                }

            } else {
                jocuri[i] = j;
                System.out.println("added");
                break;
            }
        }
    }


    void remove(String gameRemover) {
        boolean removed = false;
        int r = 0;
        for (int i = 0; i < jocuri.length; i++) {
            if (jocuri[i] != null) {
                if (jocuri[i].getNumeJoc().equals(gameRemover)) {
                    jocuri[i] = null;
                    removed = true;
                    r = i;
                    System.out.println("removed");
                    for (int j = r; j < jocuri.length - 1; j++) {
                        jocuri[j] = jocuri[j + 1];

                    }
                }

            }
        }
        if (!removed) {
            System.out.println("Game was not found");
        }
    }
}





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
/*
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
 */