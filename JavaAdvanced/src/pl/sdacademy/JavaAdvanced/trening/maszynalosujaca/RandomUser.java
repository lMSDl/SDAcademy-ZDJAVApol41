package pl.sdacademy.JavaAdvanced.trening.maszynalosujaca;

public class RandomUser {

    public String lotto() {

        int minimumOfStudents = 1;
        int numberOfStudents = 15;
        int range = numberOfStudents - minimumOfStudents + 1;
        double lottoNumber = (Math.random() * range) + 1;
        int winner = (int) lottoNumber;
        return trueListOfEnums(winner);
    }

    private String trueListOfEnums(Integer winner) {
        String student = "";

        if (winner == 1) {
            student = Users.AGATA.toString();

        } else if (winner == 2) {
            student = Users.ANDRZEJ.toString();

        } else if (winner == 3) {
            student = Users.AUREL.toString();

        } else if (winner == 4) {
            student = Users.DOMINIK.toString();

        } else if (winner == 5) {
            student = Users.DOMINIK.toString();

        } else if (winner == 6) {
            student = Users.JAKUB.toString();

        } else if (winner == 7) {
            student = Users.KAMIL.toString();

        } else if (winner == 8) {
            student = Users.KRZYSZTOF.toString();

        } else if (winner == 9) {
            student = Users.MATEUSZ.toString();

        } else if (winner == 10) {
            student = Users.MATEUSZ_P.toString();

        } else if (winner == 11) {
            student = Users.MICHAL.toString();

        } else if (winner == 12) {
            student = Users.PAWEL.toString();

        } else if (winner == 13) {
            student = Users.PIOTR.toString();

        } else if (winner == 14) {
            student = Users.RADEK.toString();

        } else if (winner == 15) {
            student = Users.MICHAL_M.toString();

        } else {
            return "Nie ma takiego ucznia!";

        }
        return student + " wchodzisz do gry!";

    }
}


