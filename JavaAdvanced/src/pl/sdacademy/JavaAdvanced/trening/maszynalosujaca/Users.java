package pl.sdacademy.JavaAdvanced.trening.maszynalosujaca;

public enum Users {

    AGATA("Agata", "1"),
    ANDRZEJ("Andrzej", "2"),
    AUREL("Aurel", "3"),
    DOMINIK("Dominik", "4"),
    DYMITR("Dymitr", "5"),
    JAKUB("Jakub", "6"),
    KAMIL("Kamil", "7"),
    KRZYSZTOF("Krzysztof", "8"),
    MATEUSZ("Mateusz", "9"),
    MATEUSZ_P("Mateusz_P", "10"),
    MICHAL("Michał", "11"),
    MICHAL_M("Michał_M", "12"),
    PAWEL("Paweł", "13"),
    PIOTR("Piotr", "14"),
    RADEK("Radek", "15");

    private final String name;
    private final String odrderNumber;

    Users(String name, String odrderNumber) {
        this.name = name;
        this.odrderNumber = odrderNumber;
    }

    public String getName() {
        return name;
    }

    public String getOdrderNumber() {
        return odrderNumber;
    }
}
