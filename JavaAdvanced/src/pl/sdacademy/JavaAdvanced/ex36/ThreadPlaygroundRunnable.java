package pl.sdacademy.JavaAdvanced.ex36;

public class ThreadPlaygroundRunnable implements Runnable{
private String name;

    public ThreadPlaygroundRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for(int i = 0; i<10; i++){
            System.out.println(String.format("%s; %s; %d", Thread.currentThread().getName(), name, i));
        }
    }
}
