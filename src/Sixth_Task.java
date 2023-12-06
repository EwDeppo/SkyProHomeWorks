public class Sixth_Task {
    public static void main(String[] args){
        int contribution = 15000;
        int total = 0;
        int month = 0;
        while (month < 108){
            total = total + total/100*7;
            total = total + contribution;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + total);
            }
        }
    }
}
