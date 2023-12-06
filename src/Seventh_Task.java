public class Seventh_Task {
    public static void main(String[] args){
        int friday = 7;
        int days = 1;
        while (days < 31){
            days++;
            if (days % friday == 0){
                System.out.println("Сегодня пятница, " + days + "-е число. Необходимо подготовить отчет");
            }
        }
    }
}
