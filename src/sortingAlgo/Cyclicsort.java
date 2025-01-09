package sortingAlgo;

import java.util.Arrays;
import java.util.Scanner;

public class Cyclicsort {
    // The Cyclic Sort algorithm is a simple sorting algorithm that works best when the numbers in the array are in a range from 1 to n, 
    // where n is the size of the array. It places each number at its correct position in O(n) times
    public void getcyclic_sort()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value:");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" no of elements into array:");
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        int i=0;
        //while loop decreases the iteration count we can check it through a counter
        while(i<n){
            int correct_pos = arr[i]-1;
            if(arr[i] != arr[correct_pos])
            {
                swap(arr,i,correct_pos);
                
            }
            else{
                i++;
            }
        }

        System.out.println(Arrays.toString(arr));
        
        sc.close();
    }

    public void swap(int[] arr,int first,int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    
}
