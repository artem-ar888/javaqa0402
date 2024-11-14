public class BmiService {
    public int calculate(double wKg, double hM) {
    int index = (int) Math.round(wKg / Math.pow(hM, 2));
    return index;
    }
}
