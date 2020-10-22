package pl.sdacademy.JavaAdvanced.trening;

public class RandomUser {
    private final int numberOfStudents = 14;

    public void lotto() {
        int minimumOfStudents = 1;
        int range = numberOfStudents - minimumOfStudents + 1;
        double lottoNumber = (Math.random() * range) + 1;
        int winner = (int) lottoNumber;
        if (winner == 1) {
            System.out.println(Users.AGATA + " wchodzisz do gry!");
        } else if (winner == 2) {
            System.out.println(Users.ANDRZEJ + " wchodzisz do gry!");
        } else if (winner == 3) {
            System.out.println(Users.AUREL + " wchodzisz do gry!");
        } else if (winner == 4) {
            System.out.println(Users.DOMINIK + " wchodzisz do gry!");
        } else if (winner == 5) {
            System.out.println(Users.DYMITR + " wchodzisz do gry!");
        } else if (winner == 6) {
            System.out.println(Users.JAKUB + " wchodzisz do gry!");
        } else if (winner == 7) {
            System.out.println(Users.KAMIL + " wchodzisz do gry!");
        } else if (winner == 8) {
            System.out.println(Users.KRZYSZTOF + " wchodzisz do gry!");
        } else if (winner == 9) {
            System.out.println(Users.MATEUSZ + " wchodzisz do gry!");
        } else if (winner == 10) {
            System.out.println(Users.MATEUSZ_P + " wchodzisz do gry!");
        } else if (winner == 11) {
            System.out.println(Users.MICHAL + " wchodzisz do gry!");
        } else if (winner == 12) {
            System.out.println(Users.PAWEL + " wchodzisz do gry!");
        } else if (winner == 13) {
            System.out.println(Users.PIOTR + " wchodzisz do gry!");
        } else if (winner == 14) {
            System.out.println(Users.RADEK + " wchodzisz do gry!");
        } else {
            System.out.println("Nie ma takiego ucznia!");
        }
    }
}
