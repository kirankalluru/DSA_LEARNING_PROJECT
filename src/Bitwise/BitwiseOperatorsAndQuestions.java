package Bitwise;

public class BitwiseOperatorsAndQuestions {
    public void bitwiseoperatorsIntro() {
        // Bitwise Operators
        // & - AND
        // | - OR
        // ^ - XOR
        // ~ - NOT
        // << - Left Shift
        // >> - Right Shift
        // >>> - Unsigned Right Shift

        // Bitwise AND
        // 0 & 0 = 0
        // 0 & 1 = 0
        // 1 & 0 = 0
        // 1 & 1 = 1
        // 5 & 6 = 4
        // 101 & 110 = 100
        System.out.println("5&6 "+(5 & 6));

        // Bitwise OR
        // 0 | 0 = 0
        // 0 | 1 = 1
        // 1 | 0 = 1
        // 1 | 1 = 1
        // 5 | 6 = 7
        // 101 | 110 = 111
        System.out.println("5|6 "+(5 | 6));

        // Bitwise XOR
        // 0 ^ 0 = 0
        // 0 ^ 1 = 1
        // 1 ^ 0 = 1
        // 1 ^ 1 = 0
        // 5 ^ 6 = 3
        // 101 ^ 110 = 011
        System.out.println("5^6 "+(5 ^ 6));

        // Bitwise NOT
        // ~0 = 1
        // ~1 = 0
        // ~5 = -6
        // ~101 = -110
        System.out.println("~5 "+(~5));

        // Left Shift
        // 5 << 1 = 10
        // 101 << 1 = 1010
        System.out.println("5<<1 "+(5 << 1));

        // Right Shift
        // 5 >> 1 = 2
        // 101 >> 1 = 10
        System.out.println("5>>1 "+(5 >> 1));

        // Unsigned Right Shift
        // 5 >>> 1 = 2
        // 101 >>> 1 = 10
        System.out.println("5>>>1 "+(5 >>> 1));


    }

    public void evenOrOdd(int n) {
        // Check if a number is even or odd using bitwise operators
        // If the last bit is 0, then the number is even
        // If the last bit is 1, then the number is odd
        if((n & 1) == 0) {
            System.out.println(n+" is even");
        } else {
            System.out.println(n+" is odd");
        }
    }

    public void swap(int a,int b)
    {
        // Swap two numbers using bitwise operators
        // a = a ^ b
        // b = a ^ b
        // a = a ^ b
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a: "+a+" b: "+b);
    }

    public int countSetBits(int n) {
        // Count the number of set bits in a number
        // 5 = 101
        // 6 = 110
        // 5 & 6 = 100
        // Count the number of 1s in the result
        int count = 0;
        while(n > 0) {              //(or)
            count += n & 1;         //count++;
            n = n >> 1;             //n = n & (n-1);
        }
        return count;
    }

    public void powerOfTwo(int n) {
        // Check if a number is a power of 2
        // If a number is a power of 2, then it has only 1 set bit
        // 8 = 1000
        // 7 = 0111
        // 8 & 7 = 0
        if((n & (n-1)) == 0) {
            System.out.println(n+" is a power of 2");
        } else {
            System.out.println(n+" is not a power of 2");
        }
    }

    public int toggleBit(int n,int k) {
        // Toggle the kth bit of a number
        // 5 = 101
        // 3rd bit = 100
        // 5 ^ 4 = 1
        return n ^ (1 << (k-1));
    }

    public void checkKthBit(int n,int k) {
        // Check if the kth bit of a number is set
        // 5 = 101
        // 3rd bit = 100
        // 5 & 4 = 4
        if((n & (1 << (k-1))) == 0) {
            System.out.println("The "+k+"th bit is not set");
        } else {
            System.out.println("The "+k+"th bit is set");
        }
    }

    public void findUniqueElement(int[] arr) {
        // Find the unique element in an array where all elements occur twice except for one element
        // XOR all elements in the array
        // The result will be the unique element
        int result = 0;
        for(int i=0;i<arr.length;i++) {
            result = result ^ arr[i];
        }
        if (result == 0) {
            System.out.println("No unique element found");
            return;
            
        }
        else{

            System.out.println("The unique element is: "+result);
        }
    }

    public void reverseBits(int n) {
        int result = 0;
        int bitCount = 32; // Assuming we're working with a 32-bit integer
        
        while (bitCount > 0) {
            result = result << 1; // Left shift the result
            result = result | (n & 1); // Add the rightmost bit of n to result
            n = n >> 1; // Right shift n to process the next bit
            bitCount--;
        }
        
        System.out.println(result);
    }

    public void swapBits(int n)
    {
        int evenBits = n & 0xAAAAAAAA;  // Extract even bits (mask = 1010...)
        int oddBits = n & 0x55555555;   // Extract odd bits (mask = 0101...)
        
        evenBits >>= 1;  // Shift even bits right
        oddBits <<= 1;   // Shift odd bits left
        
        System.out.println(evenBits | oddBits);  // Combine even and odd bits
    }
}
