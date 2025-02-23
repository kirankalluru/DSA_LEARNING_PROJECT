package TwoPointers;
import java.util.Scanner;
public class MaxsumofKElements {

    public void maxofKwindow() {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        int i=0,j=0;
        int sum = 0;
        System.out.print("enter length sub array:");
        int k = sc.nextInt();
        
        while(j<k)
        {
            sum+=arr[j++];
        }
        int max = sum;
        while(j<n)
        {
            sum = sum-arr[i++]+arr[j++];
            max = Math.max(max,sum);
            
        }
        System.out.println(max);
        sc.close();
    }
}

