package stringclasses;

public class MinimumStepsToChangeFromA_B {
    public static int minSteps(String A, String B) {
        if (A.length() != B.length()) {
            throw new IllegalArgumentException("Strings must be of the same length");
        }

        int steps = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) != B.charAt(i)) {
                steps++;
            }
        }
        return steps;
    }

    public static void main(String[] args) {
        String A = "abcdef";
        String B = "azcedf";
        System.out.println("Minimum steps to change from A to B: " + minSteps(A, B));
    }
}