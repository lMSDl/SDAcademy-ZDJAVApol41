package pl.sdacademy.JavaAdvanced.ex38;

public class MainCofe {
    public static void main(String[] args) {

        CoffeMachine coffeMachine = new CoffeMachine();

        new Thread(coffeMachine::makeCafe).start();
        //równe zapisy
        new Thread(() -> coffeMachine.makeCafe()).start();
        new Thread(() -> coffeMachine.makeCafe()).start();

        new Thread(() -> coffeMachine.refill(1)).start();


    }
}
