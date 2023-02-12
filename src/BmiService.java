public class BmiService {

    public int calculate(double heigh, int weight) {
        int bmi = (int) (weight / (heigh * heigh));

        return bmi;
    }
}
