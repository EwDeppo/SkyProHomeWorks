public class Fourth_Task {
    public static void main(String[] args){
        int contribution = 15000;
        int total = 0;
        int month = 0;
        while (total < 12_000_000){
            total = total + contribution;
            total = total + total/100*7;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total);
        }
    }
}
