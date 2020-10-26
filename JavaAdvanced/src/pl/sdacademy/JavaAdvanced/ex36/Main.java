package pl.sdacademy.JavaAdvanced.ex36;

public class Main {
    private static Thread polePierwsze;
    private static Thread poleDrugie;
    public static void main(String[] args) {
    polePierwsze = new Thread(new ThreadPlaygroundRunnable("pole pierwsze"));
    poleDrugie = new Thread(new ThreadPlaygroundRunnable("pole drugie"));

    polePierwsze.start();
    poleDrugie.start();
    }
}
