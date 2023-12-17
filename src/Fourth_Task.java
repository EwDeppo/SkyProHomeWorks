import java.util.Arrays;

public class Fourth_Task {
    public static void main(String[] args){
        int[] arr = {1, 2, 3};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1){
                arr[i]++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
