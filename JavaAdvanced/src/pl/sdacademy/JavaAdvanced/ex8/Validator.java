package pl.sdacademy.JavaAdvanced.ex8;

public class Validator implements IValidator {


    @Override
    public boolean validate(Parcel input) {
        if (input.getxLength() + input.getyLength() + input.getzLength() <= 300) {
            if (input.getxLength() <= 30 && input.getzLength() <= 30 && input.getyLength() <= 30) {
                if (input.isExpress()) {
                    if (input.getWeight() <= 15) {
                        return true;
                    }
                } else {
                    if (input.getWeight() <= 30)
                        return true;
                }
            }
        }
        System.out.println("nie da się!");
        return false;
    }
}



