public class BmiService {
    public int calculate(double weightKG, double heightM) {
        int index = (int) Math.round(weightKG / Math.pow(heightM, 2));
        return index;
    }
}
