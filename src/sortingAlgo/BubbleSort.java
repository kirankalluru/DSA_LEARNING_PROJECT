package sortingAlgo;

import java.util.Scanner;

public class BubbleSort {
    public void getBubbleSort()
    {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter no of Elements in the Array: ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
    }
    for (int i = 0; i < arr.length; i++) {
        for (int j = i+1; j < arr.length; j++) {
            if (arr[i] >arr[j]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
    }
    sc.close();
    }
}
