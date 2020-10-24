package pl.sdacademy.JavaAdvanced.trening.maszynalosujaca;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Scanner;


public class MapOfStudents {
    Scanner scanner = new Scanner(System.in);
    private EnumMap<Users, Integer> mapOfStudents;
    private EnumMap<Users, Integer> localDoMap;
    List<Users> numberFromLocalDoMapList = new ArrayList<>();
    List<Users> listOfWhoWillNotBeConsideredForLottery = new ArrayList<>();
    private String out = "1";

    public EnumMap<Users, Integer> showStudents() {
        this.mapOfStudents = new EnumMap<Users, Integer>(Users.class);
        mapOfStudents.put(Users.AGATA, 1);
        mapOfStudents.put(Users.ANDRZEJ, 2);
        mapOfStudents.put(Users.AUREL, 3);
        mapOfStudents.put(Users.DOMINIK, 4);
        mapOfStudents.put(Users.DYMITR, 5);
        mapOfStudents.put(Users.JAKUB, 6);
        mapOfStudents.put(Users.KAMIL, 7);
        mapOfStudents.put(Users.KRZYSZTOF, 8);
        mapOfStudents.put(Users.MATEUSZ, 9);
        mapOfStudents.put(Users.MATEUSZ_P, 10);
        mapOfStudents.put(Users.MICHAL, 11);
        mapOfStudents.put(Users.MICHAL_M, 12);
        mapOfStudents.put(Users.PAWEL, 13);
        mapOfStudents.put(Users.PIOTR, 14);
        mapOfStudents.put(Users.RADEK, 15);
        return this.mapOfStudents;
    }


    public void whichStudent() {

        Scanner scanner = new Scanner(System.in);
        String pozostaleOsoby = "Osoby, które pozostały do losowania: ";
        EnumMap<Users, Integer> localMap = new EnumMap<Users, Integer>(mapOfStudents);
        // this.out = "1";

        do {
            if (!out.equals("n")) {
                do {
                    if (!out.equals("n")) {
                        out = scanner.next().toLowerCase();

                        if (out.equals("1") || (out.equals("agata"))) {
                            localMap.remove(Users.AGATA);
                        }
                        if (out.equals("2") || out.equals("andrzej")) {
                            localMap.remove(Users.ANDRZEJ);
                        }
                        if (out.equals("3") || out.equals("aurel")) {
                            localMap.remove(Users.AUREL);
                        }
                        if (out.equals("4") || out.equals("dominik")) {
                            localMap.remove(Users.DOMINIK);
                        }
                        if (out.equals("5") || out.equals("dymitr")) {
                            localMap.remove(Users.DYMITR);
                        }
                        if (out.equals("6") || out.equals("jakub")) {
                            localMap.remove(Users.JAKUB);
                        }
                        if (out.equals("7") || out.equals("kamil")) {
                            localMap.remove(Users.KAMIL);
                        }
                        if (out.equals("8") || out.equals("krzysztof")) {
                            localMap.remove(Users.KRZYSZTOF);
                        }
                        if (out.equals("9") || out.equals("mateusz")) {
                            localMap.remove(Users.MATEUSZ);
                        }
                        if (out.equals("10") || out.equals("mateusz_p")) {
                            localMap.remove(Users.MATEUSZ_P);
                        }
                        if (out.equals("11") || out.equals("michal")) {
                            localMap.remove(Users.MICHAL);
                        }
                        if (out.equals("12") || out.equals("michal_m")) {
                            localMap.remove(Users.MICHAL_M);
                        }
                        if (out.equals("13") || out.equals("pawel")) {
                            localMap.remove(Users.PAWEL);
                        }
                        if (out.equals("14") || out.equals("piotr")) {
                            localMap.remove(Users.PIOTR);
                        }
                        if (out.equals("15") || out.equals("radek")) {
                            localMap.remove(Users.RADEK);
                        }
                    }


                    if (!out.equals("n")) {
                        localDoMap = new EnumMap<Users, Integer>(localMap);
                        returnValue(pozostaleOsoby, localDoMap);
                    } else break;
                } while (out.equals("n"));
            } else break;
        } while (!this.out.equals("n"));
    }

    public String rockAndRoll() {
        if (this.out.equals("n")) {
            whoWillBeChosenOne();
            System.out.println();
            return "Losowanie: ";
        }
        return "błąd";
    }


    private void returnValue(String pozostaleOsoby, EnumMap<Users, Integer> localMap) {
        System.out.println(pozostaleOsoby);
        System.out.println(localMap);
        System.out.println();
        System.out.print("Czy ktoś jeszcze nie bierze udzuału w losowaniu? Jeżeli nie, kliknij \"n\": ");
    }

    private void whoWillBeChosenOne() {

        if (this.localDoMap.containsKey(Users.AGATA))
            numberFromLocalDoMapList.add(Users.AGATA);
        else listOfWhoWillNotBeConsideredForLottery.add(Users.AGATA);
        if (this.localDoMap.containsKey(Users.ANDRZEJ))
            numberFromLocalDoMapList.add(Users.ANDRZEJ);
        else listOfWhoWillNotBeConsideredForLottery.add(Users.ANDRZEJ);
        if (this.localDoMap.containsKey(Users.AUREL))
            numberFromLocalDoMapList.add(Users.AUREL);
        else listOfWhoWillNotBeConsideredForLottery.add(Users.AUREL);
        if (this.localDoMap.containsKey(Users.DOMINIK))
            numberFromLocalDoMapList.add(Users.DOMINIK);
        else listOfWhoWillNotBeConsideredForLottery.add(Users.DOMINIK);
        if (this.localDoMap.containsKey(Users.DYMITR))
            numberFromLocalDoMapList.add(Users.DYMITR);
        else listOfWhoWillNotBeConsideredForLottery.add(Users.DYMITR);
        if (this.localDoMap.containsKey(Users.JAKUB))
            numberFromLocalDoMapList.add(Users.JAKUB);
        else listOfWhoWillNotBeConsideredForLottery.add(Users.JAKUB);
        if (this.localDoMap.containsKey(Users.KAMIL))
            numberFromLocalDoMapList.add(Users.KAMIL);
        else listOfWhoWillNotBeConsideredForLottery.add(Users.KAMIL);
        if (this.localDoMap.containsKey(Users.KRZYSZTOF))
            numberFromLocalDoMapList.add(Users.KRZYSZTOF);
        else listOfWhoWillNotBeConsideredForLottery.add(Users.KRZYSZTOF);
        if (this.localDoMap.containsKey(Users.MATEUSZ))
            numberFromLocalDoMapList.add(Users.MATEUSZ);
        else listOfWhoWillNotBeConsideredForLottery.add(Users.MATEUSZ);
        if (this.localDoMap.containsKey(Users.MATEUSZ_P))
            numberFromLocalDoMapList.add(Users.MATEUSZ_P);
        else listOfWhoWillNotBeConsideredForLottery.add(Users.MATEUSZ_P);
        if (this.localDoMap.containsKey(Users.MICHAL))
            numberFromLocalDoMapList.add(Users.MICHAL);
        else listOfWhoWillNotBeConsideredForLottery.add(Users.MICHAL);
        if (this.localDoMap.containsKey(Users.MICHAL_M))
            numberFromLocalDoMapList.add(Users.MICHAL_M);
        else listOfWhoWillNotBeConsideredForLottery.add(Users.MICHAL_M);
        if (this.localDoMap.containsKey(Users.PAWEL))
            numberFromLocalDoMapList.add(Users.PAWEL);
        else listOfWhoWillNotBeConsideredForLottery.add(Users.PAWEL);
        if (this.localDoMap.containsKey(Users.PIOTR))
            numberFromLocalDoMapList.add(Users.PIOTR);
        else listOfWhoWillNotBeConsideredForLottery.add(Users.PIOTR);
        if (this.localDoMap.containsKey(Users.RADEK))
            numberFromLocalDoMapList.add(Users.RADEK);
        else listOfWhoWillNotBeConsideredForLottery.add(Users.RADEK);
        System.out.println();
        System.out.println("Lista osób, które nie biorą udziału w losowaniu: ");
        for (int i = 0; i < listOfWhoWillNotBeConsideredForLottery.size(); i++) {
            System.out.print(i + 1);
            System.out.println(": " + listOfWhoWillNotBeConsideredForLottery.get(i));
        }
        System.out.println();
        System.out.println("Lista osób do losowania: ");
        for (int i = 0; i < numberFromLocalDoMapList.size(); i++) {
            System.out.print(i + 1);
            System.out.println(": " + numberFromLocalDoMapList.get(i));
        }
    }

    public String forMeItsLotto() {
        int size = numberFromLocalDoMapList.size();
        double lottoNumber = (Math.random() * size);
        int winner = (int) Math.floor(lottoNumber);
        System.out.println("wybrano numer: " + (winner + 1));
        return numberFromLocalDoMapList.get(winner) + " pokaż, na co Cię stać!";
    }

    public String repeta() {
        String confirmation = "";
        do {
            System.out.println();
            System.out.print("Czy chcesz powtórzyć losowanie z wybraną uprzednio listą? Wciśnij \"t\" jesli tak, \"n\" jeśli nie: ");
            confirmation = scanner.nextLine();
            if (confirmation.equals("t")) {
                System.out.println(forMeItsLotto());
            }
        } while (confirmation.equals("t"));
        return "koniec programu";
    }
}



