public class Solution {
    public static void towerOfHanoi(int n, String source, String helper, String destination) {
        if (n == 1) {
            System.out.println("Transfer disk " + n + " from " + source + " to " + destination);
            return;
        }
        // Step 1: Move n-1 disks from Source to Helper
        towerOfHanoi(n - 1, source, destination, helper);

        // Step 2: Move nth disk from Source to Destination
        System.out.println("Transfer disk " + n + " from " + source + " to " + destination);

        // Step 3: Move n-1 disks from Helper to Destination
        towerOfHanoi(n - 1, helper, source, destination);
    }

    public static void main(String[] args) {
        towerOfHanoi(3, "S", "H", "D");
    }
}
