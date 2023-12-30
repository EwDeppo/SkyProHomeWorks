public class FirstTask {

    public static boolean checkLeapYear(int year){
        if (year % 400 == 0)return true;
        if (year % 100 == 0) return false;
        return year % 4 == 0;
    }

    public static void defineYear(int year) {
        if (checkLeapYear(year)) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }
    public static void main(String[] args){
        int year = 2021;
        defineYear(year);
    }
}
