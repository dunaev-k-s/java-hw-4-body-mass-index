public class BmiService {
    public double calculate(int height, int weight) {
        int integerBmi = 1_000_000*weight/height/height;
        double bmi = integerBmi/100d;
        return bmi;
    }
}
