package pl.sdacademy.JavaAdvanced.ex7;

public class Main {
    public static void main(String[] args) {
        Gun gun = new Gun(5);
        gun.loadBullet("boom");
        gun.loadBullet("pow");
        gun.loadBullet("blam");
        gun.loadBullet("hapow");
        gun.loadBullet("pif");
        gun.isLoaded();
        gun.shot();
        gun.shot();
        gun.shot();
        gun.shot();
        gun.shot();
        gun.shot();
        gun.shot();

    }
}
