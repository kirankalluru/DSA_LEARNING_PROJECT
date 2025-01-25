package arrayclasses;
import java.util.Scanner;

public class MaxLengthOfConsecutive1 {
    public void maxLengthOfConsecutiveones(){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max =0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            }
            else{
                max = Math.max(max, count);
                count = 0;
            }
        }
        max = Math.max(max, count);
        System.out.println(max);
        sc.close();

    }
}
