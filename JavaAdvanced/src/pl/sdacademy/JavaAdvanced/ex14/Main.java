package pl.sdacademy.JavaAdvanced.ex14;

public class Main {
    public static void main(String[] args) {

        Array tablica = new Array();
        tablica.deduplicate();
        System.out.println(tablica.getArray());
        System.out.println(tablica.getUniqeValueByStream());
        System.out.println(tablica.getDoubleIntegerByStream());
        System.out.println(tablica.get25MostCommon());

        System.out.println(tablica.getDoubleIntegerByStream());
    }
}
