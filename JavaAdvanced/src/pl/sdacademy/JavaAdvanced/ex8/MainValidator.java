package pl.sdacademy.JavaAdvanced.ex8;

public class MainValidator {
    public static void main(String[] args) {
        Validator validator = new Validator();
        Parcel parcel = new Parcel(12, 30, 16, 17, true);

                validator.validate(parcel);
    }
}
