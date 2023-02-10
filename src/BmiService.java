public class BmiService {
    public int calculate(double meters, double kilos) {
        double index;
        index = kilos / (meters * meters);
        return (int) index;
    }
}
