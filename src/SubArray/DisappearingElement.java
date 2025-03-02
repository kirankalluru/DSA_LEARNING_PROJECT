package SubArray;
import java.util.*;
//write something about question
//Given an array of integers and an integer k, you need to find the largest almost missing integer in the array. An integer is almost missing if it is missing in at most k subarrays of the array. If there are multiple such integers, return the largest one. If there is no such integer, return -1.
//Example
//Input: nums = [3,9,7,2,1,7], k = 2
//Output: 3
//Explanation: The almost missing integers are [2,3,7]. 2 is the largest integer that is missing in at most 2 subarrays.
//Input: nums = [2,3,9,7,1], k = 2
//Output: 2
//Explanation: There is no integer that is missing in at most 2 subarrays.
//Approach
//We can solve this problem by iterating over all subarrays of length k and maintaining a count of the number of times each integer is seen in the subarray. We can then find the largest almost missing integer by iterating over the counts and finding the integer that is missing in at most k subarrays.
//Algorithm
//Create a map countMap to store the count of each integer in the subarray.
//Iterate over all subarrays of length k and maintain a set seenInSubarray to store the integers seen in the subarray.
//Iterate over the integers in seenInSubarray and increment the count of each integer in countMap.
//Iterate over the integers in countMap and find the integer that is missing in at most k subarrays.
//Return the largest such integer.
//Complexity Analysis
//The time complexity for this approach is O(n^2) where n is the length of the input array nums. This is because we are iterating over all subarrays of length k. The space complexity is O(n) where n is the length of the input array nums. This is because we are using a map countMap to store the count of each integer in the subarray.
//Code
//The code for this approach is given below.
public class DisappearingElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        sc.close();
        int arr[] = {2,3,9,7,1};
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
