package pl.sdacademy.JavaAdvanced.trening;

public enum Users {
    AGATA{
        @Override
        String imie() {
            return "Agata";
        }
    },
    ANDRZEJ{
        @Override
        String imie() {
            return "Andrzej";
        }
    },
    AUREL{
        @Override
        String imie() {
            return "Aurel";
        }
    },
    DOMINIK{
        @Override
        String imie() {
            return "Dominik";
        }
    },
    DYMITR{
        @Override
        String imie() {
            return "Dymitr";
        }
    },
    JAKUB{
        @Override
        String imie() {
            return "Jakub";
        }
    },
    KAMIL{
        @Override
        String imie() {
            return "Kamil";
        }
    },
    KRZYSZTOF{
        @Override
        String imie() {
            return "Krzysztof";
        }
    },
    MATEUSZ{
        @Override
        String imie() {
            return "Mateusz";
        }
    },
    MATEUSZ_P{
        @Override
        String imie() {
            return "Mateusz P.";
        }
    },
    MICHAL{
        @Override
        String imie() {
            return "Michał";
        }
    },
    MICHAL_M{
        @Override
        String imie() {
            return "Michał M.";
        }
    },
    PAWEL{
        @Override
        String imie() {
            return "Paweł";
        }
    },
    PIOTR{
        @Override
        String imie() {
            return "Piotr";
        }
    },
    RADEK{
        @Override
        String imie() {
            return "Radek";
        }
    };

    abstract String imie();
}
