public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double meters = 1.87;
        double kilos = 98;
        int index = service.calculate(meters, kilos);
        System.out.println(index);
    }
}
