package day1;


public class Day3 {
    public static void main(String[] args) {

//        Character.toUpperCase(char);
        char[] mystring = {'a', 'n', 'a'};
        char[] myString2 = new char[mystring.length];
        for (int i = 0; i < mystring.length; i++) {
            myString2[i] = Character.toUpperCase(mystring[i]);

        }
        System.out.println(myString2);
    }

}
