public class SecondTask {
    public static void main(String[] args) {
        SecondTask();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void SecondTask() {
        int[] arr = generateRandomArray();
        int minSum = -1;
        int maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxSum) {
                maxSum = arr[i];
            }
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > minSum){
                minSum = arr[i + 1];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSum + " рублей. Максимальная сумма трат за день составила " + maxSum + "рублей");

    }
}
