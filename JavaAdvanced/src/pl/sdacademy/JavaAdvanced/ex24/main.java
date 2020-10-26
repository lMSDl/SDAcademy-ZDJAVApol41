package pl.sdacademy.JavaAdvanced.ex24;

public class main {
    public static void main(String[] args) {

        Basket basket = new Basket();

        for (int i = 0; i < 12; i++) {
            try {
                basket.addToBasket();
                //basket.removeFromBasket();
//            } catch (Basket.BasketEmptyException basketEmptyException) {
//                System.out.println("Basket is empty");
            } catch (Basket.BasketFullException basketFullException) {
                System.out.println("Basket is full");
            }

        }

    }
}
