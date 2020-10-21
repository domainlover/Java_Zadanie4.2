public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bmi = service.calculate(125.50, 1.90);
        System.out.println(bmi);
    }
}
