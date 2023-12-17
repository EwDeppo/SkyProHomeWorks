public class Second_Task {
    public static void main(String[] args){
        int[] first = {5, 7, 4, 9, 3};
        for (int i = 0; i < first.length; i++) {
            if (i == first.length - 1) {
                System.out.println(first[i]);
                break;
            }
            System.out.print(first[i] + ", ");
        }
        double[] second = {1.57, 7.654, 9.986};
        for (int i = 0; i < second.length; i++) {
            if (i == second.length - 1) {
                System.out.println(second[i]);
                break;
            }
            System.out.print(second[i] + ", ");
        }
        String[] third = {"Hello", "World", "!"};
        for (int i = 0; i < third.length; i++) {
            if (i == third.length - 1) {
                System.out.println(third[i]);
                break;
            }
            System.out.print(third[i] + ", ");
        }
    }
}
