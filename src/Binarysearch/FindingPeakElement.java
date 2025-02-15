package Binarysearch;

import java.util.Scanner;

public class FindingPeakElement {
    public void Main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements in having a peak point: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Index of a peak point is " + findPeak(arr, n));
    }

    //this is implemented using binary search

    public int findPeak(int arr[],int n)
    {
        int low = 0,high = n-1;

        while(low<=high)
        {
            int mid = low + (high-low)/2;

            if((mid == 0 || arr[mid]>arr[mid+1]) && (mid == n-1 || arr[mid]>arr[mid+1]))
            {
                return arr[mid];
            }

            if(mid>0 && arr[mid-1]>arr[mid])
            {
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }

        return -1;
    }
}
