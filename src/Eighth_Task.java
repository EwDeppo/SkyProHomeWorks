public class Eighth_Task {
    public static void main(String[] args) {
        int savings = 29000;
        int total = 0;
        for (int i = 1; i < 13; i++) {
            total = total + savings;
            System.out.println("Месяц " + i  + ", сумма накоплений равна " + total + " рублей");
        }
    }
}
