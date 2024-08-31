public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.87;
        int weight = 85;
        int BMI = service.calculate(height, weight);
        System.out.println("Индекс BMI: " + BMI);
    }
}