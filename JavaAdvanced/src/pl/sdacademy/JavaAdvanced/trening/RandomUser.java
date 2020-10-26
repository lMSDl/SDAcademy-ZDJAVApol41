package pl.sdacademy.JavaAdvanced.trening;

public class RandomUser {
    private final int numberOfStudents = 15;

    public void lotto() {
        int minimumOfStudents = 1;
        int range = numberOfStudents - minimumOfStudents + 1;
        double lottoNumber = (Math.random() * range) + 1;
        int winner = (int) lottoNumber;
        if (winner == 1) {
            System.out.println(Users.AGATA.imie() + ", wchodzisz do gry!");
        } else if (winner == 2) {
            System.out.println(Users.ANDRZEJ.imie() + ", wchodzisz do gry!");
        } else if (winner == 3) {
            System.out.println(Users.AUREL.imie() + ", wchodzisz do gry!");
        } else if (winner == 4) {
            System.out.println(Users.DOMINIK.imie() + ", wchodzisz do gry!");
        } else if (winner == 5) {
            System.out.println(Users.DYMITR.imie() + ", wchodzisz do gry!");
        } else if (winner == 6) {
            System.out.println(Users.JAKUB.imie() + ", wchodzisz do gry!");
        } else if (winner == 7) {
            System.out.println(Users.KAMIL.imie() + ", wchodzisz do gry!");
        } else if (winner == 8) {
            System.out.println(Users.KRZYSZTOF.imie() + ", wchodzisz do gry!");
        } else if (winner == 9) {
            System.out.println(Users.MATEUSZ.imie() + ", wchodzisz do gry!");
        } else if (winner == 10) {
            System.out.println(Users.MATEUSZ_P.imie() + ", wchodzisz do gry!");
        } else if (winner == 11) {
            System.out.println(Users.MICHAL.imie() + ", wchodzisz do gry!");
        } else if (winner == 12) {
            System.out.println(Users.MICHAL_M.imie() + ", wchodzisz do gry!");
        } else if (winner == 13) {
            System.out.println(Users.PAWEL.imie() + ", wchodzisz do gry!");
        } else if (winner == 14) {
            System.out.println(Users.PIOTR.imie() + ", wchodzisz do gry!");
        } else if (winner == 15) {
            System.out.println(Users.RADEK.imie() + ", wchodzisz do gry!");
        } else {
            System.out.println("Nie ma takiego ucznia!");
        }
    }
}
