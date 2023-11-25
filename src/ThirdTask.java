public class ThirdTask {
    private static boolean checkLeapYear(int year) {
        if (year % 400 == 0)return true;
        if (year % 100 == 0)return false;
        return year % 4 == 0;
    }
    public static void define(int year) {;
        if (checkLeapYear(year)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    public static void main(String[] args) {
        int year = 1600;
        define(year);

    }
}
