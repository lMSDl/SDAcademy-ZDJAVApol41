package pl.sdacademy.JavaAdvanced.ex38;

public class CoffeMachine {
    private double levelOfWater;

    public synchronized void refill(double water) {
        if (levelOfWater + water >= 1) {
            levelOfWater = 1;
        } else levelOfWater += water;
        notifyAll();
    }

    public synchronized void makeCafe() {
       while (levelOfWater < 0.2) {
            System.out.println("czekam na wode");
            try {
                wait();
            } catch (InterruptedException e) {

            }
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        double cofeWater = this.levelOfWater - 0.2;
        levelOfWater = cofeWater;
        System.out.println("zrobił kawę i zostało: " + cofeWater);

    }


}
