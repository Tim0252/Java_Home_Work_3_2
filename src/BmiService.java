public class BmiService {
    public int calculate (double height, int weight) {
        int bmi;
        bmi = (int) (weight / Math.pow (height, 2));
        return bmi;
    }
}