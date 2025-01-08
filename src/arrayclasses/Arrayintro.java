package arrayclasses;

import java.util.Scanner;

public class Arrayintro {
    public void arrayprint()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = sc.nextInt();

        for (int i =1; i <= n; i++) {
            System.out.print(i+" ");
        }
        sc.close();
    }
}
