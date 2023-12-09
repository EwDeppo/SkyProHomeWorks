public class First_Task {
    public static void main(String[] args) {
        int i = 1, saving = 15000, total = 0;
        while (total < 2_459_000){
            i++;
            total = total + total/100;
            total = total + saving;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }
}
