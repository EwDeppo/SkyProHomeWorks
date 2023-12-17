public class Third_Task {
    public static void main(String[] args){
        int[] first = {5, 7, 4, 9, 3};
        for (int i = first.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(first[i]);
                break;
            }
            System.out.print(first[i] + ", ");
        }
        double[] second = {1.57, 7.654, 9.986};
        for (int i = second.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(second[i]);
                break;
            }
            System.out.print(second[i] + ", ");
        }
        String [] third = {"Hello", "World", "!"};
        for (int i = third.length - 1; i >= 0; i--) {
            if (i == 0){
                System.out.println(third[i]);
                break;
            }
            System.out.print(third[i] + ", ");
        }

    }
}
