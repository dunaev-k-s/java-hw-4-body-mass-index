public class Main {
    public static void main(String[] args){
        BmiService service = new BmiService();
        int height = 180;
        int weight = 65;
        double bmi = service.calculate(height, weight);
        System.out.println("Your body mass index = " + bmi);
    }
}
