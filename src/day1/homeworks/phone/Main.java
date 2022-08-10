package day1.homeworks.phone;

public class Main {
    public static void main(String[] args) {
        int a = 0;
        Agenda agendaIonut = new Agenda();
        Agenda agendaVlad = new Agenda();

        System.out.println(" ===== Adding agendaIonut content =====");

        Person p = new Person("Ionut", "0743");
        Person person = new Person("Daniel", "0322");
        Person person1 = new Person("Daniel1", "03221");

        Person person2 = new Person("Daniel2", "03222");

        agendaIonut.addNumberInAgenda(p);
        agendaIonut.addNumberInAgenda(person);
        agendaIonut.addNumberInAgenda(person1);
        agendaIonut.addNumberInAgenda(person2);

        Person persond = new Person("Daniel", "0322");

        agendaIonut.addNumberInAgenda(persond);

        agendaVlad.addNumberInAgenda(p);


        //System.out.println(person.getName());
        System.out.println(" ===== Printing agendaIonut content =====");



        //print agendaIonut content -- maybe here you need to add a new method to have acces to agendaIonut content
        System.out.println(" ===== Removing from agendaIonut content =====");

        agendaIonut.removePersonFromAgenda(new Person("Vasile","432"));


        //remove a person from agendaIonut
        System.out.println(" ===== Printing agendaIonut content =====");
        //print agendaIonut content
        System.out.println(" ===== Updating something in agendaIonut =====");

        //update a phone number
        agendaIonut.updatePhoneNumberInAgenda("03221", "1234");
        //update a phone name
        agendaVlad.updateNameOfPersonFromAgenda("Ionut", "Andrei");
        System.out.println(" ===== Printing agendaIonut content =====");
        // print agendaIonut content
                for (int i = 0; i < agendaIonut.getAgendContent().size(); i++) {
            System.out.println(agendaIonut.getAgendContent().get(i));
        }
        System.out.println(" ===== Printing agendaIonut sorted =====");
        //print agendaIonut sorted

    }
}


/*
        String temp = null;
        for (int i = 0; i < x.length; i++) {
            for (int j = 1; j < x.length - 1; j++) {
                if (x[j - 1].compareToIgnoreCase(x[j]) > 0) {
                    temp = x[j - 1];
                    x[j - 1] = x[j];
                    x[j] = temp;
                }
            }

        }
        System.out.println("Before Sorting");
        for (String z:x) {
            System.out.println(z);

        }
 */
