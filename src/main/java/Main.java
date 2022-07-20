import ru.netology.sqr.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int min = 200;
        int max = 500;
        System.out.println(service.calcSqrtInRange(min, max));

    }
}