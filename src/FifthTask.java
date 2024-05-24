import java.time.Month;
import java.util.Arrays;

public class FifthTask {
    public static void checkNumberOfMonth(int number) {
        if (number < 1 || number > 12) {
            System.out.println("Такого месяца не существует");
            return;
        }
        Arrays.stream(Month.values()).forEach(month -> {
            if (month.getValue() == number) {
                System.out.println(month);
            }
        });
    }

    public static void main(String[] args) {
        checkNumberOfMonth(9);
    }
}

