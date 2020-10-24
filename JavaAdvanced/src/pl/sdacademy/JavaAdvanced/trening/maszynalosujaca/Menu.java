package pl.sdacademy.JavaAdvanced.trening.maszynalosujaca;

import java.util.Scanner;

public class Menu {

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("    *** Witamy w maszynie losującej uczniów do robienia zadań! ***");
        System.out.println();
        System.out.print("Czy wszyscy uczniowie biorą teraz udział w losowaniu? Wciśnij \"t\" jeśli tak, w przeciwnym razie \"n\": ");
        String trueOrFalse = scanner.nextLine().toLowerCase();
        System.out.println();
        if (trueOrFalse.equals("t")) {
            RandomUser randomUser = new RandomUser();
            System.out.print("Wylosowano: ");
            System.out.println(randomUser.lotto());
        } else if (trueOrFalse.equals("n")) {
            System.out.println("Który uczeń z listy nie bierze udziału w losowaniu?");
            MapOfStudents mapOfStudents = new MapOfStudents();
            System.out.println(mapOfStudents.showStudents());
            System.out.println();
            System.out.print("Kogo wybierasz? Wpisz imię albo numer: ");
            mapOfStudents.whichStudent();
            System.out.println();
            System.out.println(mapOfStudents.rockAndRoll());
            System.out.println(mapOfStudents.forMeItsLotto());
            System.out.println(mapOfStudents.repeta());

        }
    }
}

