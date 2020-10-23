package pl.sdacademy.JavaAdvanced.ex15;



public enum Car implements Comparable<Car> {
    FERRARI(500000, 650),
    PORSCHE(450000, 500),
    MERCEDES(300000, 400),
    BMW(70000, 200),
    OPEL(90000, 120),
    FIAT(40000, 100),
    TOYOTA(100000, 110);

    private int cena;
    private int moc;


    Car(int cena, int moc) {
        this.cena = cena;
        this.moc = moc;
    }

    public int getMoc() {
        return moc;
    }

    public boolean isPremium(){
        return true;
    }
    public boolean isRegular(){
        return false;
    }


//    public boolean isFasterThan(Car car, Car car2){
//        return compare(car, car2) > 0;
//    }



}
