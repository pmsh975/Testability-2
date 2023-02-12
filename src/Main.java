public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heigh = 1.87;
        int weight = 98;
        int bmi = service.calculate(heigh, weight); // должно получиться 28
        System.out.println(bmi);
    }
}
