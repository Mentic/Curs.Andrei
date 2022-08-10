package day1.homeworks.phone;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    private ArrayList<Person> agendContent = new ArrayList<>();

    /*
  this methdo should add a created person in agenda
  minimal checks should be don
      1. p has name
      2. p has phone number
  If one field is not defined, a message should be displayed and person is not added in agenda.
  Before adding the person in agenda, check that the number and name does not exists
   */
    public void addNumberInAgenda(Person p) {

        agendContent.add(p);
    }

    /*
    Remove a person from agenda
    Minimal checks made for the person to be removed
        1. p has name
        2. p has phone number
     */
    public void removePersonFromAgenda(Person p) {
        boolean exist=false;
        for (Person x:agendContent) {
            if(p.equals(x)){
                agendContent.remove(x);
                System.out.println("removed");
                exist=true;
                break;
            }

        }
        if (!exist){
            System.out.println("Person was not found in your agenda");
        }

    }

    /*
    Those 2 parameters represents:
        phoneNumber -- phone number of the person to whom we want to update the name
        name -- name that we want to use to update the name of the
     */
    public void updatePhoneNumberInAgenda(String phoneNumeber, String numberToUpdate) {
        boolean changed=false;
        for (Person x:agendContent) {
            if(x.getPhoneNumber().equals(phoneNumeber)){
                x.setPhoneNumber(numberToUpdate);
                System.out.println("Phone number changed ");
                changed=true;
                break;

            }

        }
        if(!changed){
            System.out.println("Phone number was not found");
        }
    }

    public void updateNameOfPersonFromAgenda(String name, String nameToUpdate) {
        boolean changed=false;
        for (Person x:agendContent) {
            if(x.getName().equals(name)){
                x.setName(nameToUpdate);
                System.out.println("Name changed ");
                changed=true;
                break;

            }
            if(!changed){
                System.out.println("Name was not found");
            }
        }


    }

    /*
    Return a NEW array list, that contains the agenda sorted by name
     */
    public ArrayList<Person> getAgendaSortedByName() {

        return null;
    }

    public ArrayList<Person> getAgendContent() {
        return this.agendContent;
    }

}

