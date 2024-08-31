import java.util.Arrays;

public class Equal {
    public static boolean arrayEqual(int[] A1, int[] A2) {
        int N = A1.length;
        int M = A2.length;

        // If lengths of arrays are not equal, return false
        if (N != M) {
            return false; // Corrected boolean literal
        }

        // Sort both arrays
        Arrays.sort(A1);
        Arrays.sort(A2);

        // Compare elements linearly
        for (int i = 0; i < N; i++) { // Corrected loop syntax
            if (A1[i] != A2[i]) {
                return false; // Return false if any elements do not match
            }
        }

        return true; // Return true if all elements match
    }

    public static void main(String[] args) {
        int[] A1 = {60, 80, 95, 62, 12};
        int[] A2 = {62, 95, 80, 12, 60};

        if (arrayEqual(A1, A2)) {
            System.out.println("Yes"); // Expected output: Yes
        } else {
            System.out.println("No");
        }
    }
}
