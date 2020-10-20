package pl.sdacademy.JavaAdvanced.ex8;

public class Validator implements IValidator {

    public final static int MAX_DIMENSION_SUM = 300;
    public final static int MAX_DIMENSION = 30;
    public final static float MAX_EXPRESS_WEIGHT = 15;
    public final static float MAX_WEIGHT = 30;

    @Override
    public boolean validate(Parcel input) {
        if (input.getxLength() + input.getyLength() + input.getzLength() <= MAX_DIMENSION_SUM) {
            if (input.getxLength() <= MAX_DIMENSION && input.getzLength() <= MAX_DIMENSION && input.getyLength() <= MAX_DIMENSION) {
                if(input.getWeight() <= (input.isExpress() ? MAX_EXPRESS_WEIGHT : MAX_WEIGHT)) {
                    return true;
                }
            }
        }
        System.out.println("nie da się!");
        return false;
    }
}



