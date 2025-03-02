package SubArray;
import java.util.*;

public class DisappearingElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        sc.close();

        
        int arr[] = {3,9,7,2,1,7};

        
        

        
        int result = findelement(arr, k);

        System.out.println("Largest almost missing integer: " + result);
        
    }

    public static int findelement(int nums[], int k) {
        Map<Integer, Integer> countMap = new HashMap<>();

       
        for (int i = 0; i <= nums.length - k; i++) {
            Set<Integer> seenInSubarray = new HashSet<>(); 
            for (int j = i; j < i + k; j++) {
                seenInSubarray.add(nums[j]); 
            }
           
            for (int num : seenInSubarray) {
                countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            }
        }

        int result = -1;
        for (int num : countMap.keySet()) {
            if (countMap.get(num) == 1) { 
                result = Math.max(result, num);
            }
        }

        return result;
    }
}
