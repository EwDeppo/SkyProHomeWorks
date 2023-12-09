public class Third_Task {
    public static void main(String[] args){
        int population = 12_000_000;
        int birthRate = 17;
        int mortality = 8;
        int year = 0;
        while (year < 10){
            population = population/1000 + birthRate - mortality + population;
            year++;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
    }
}
