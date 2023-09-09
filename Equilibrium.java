public class Equilibrium {
    public static int equilibrium(int[] arr) {
        int n = arr.length;

        // Calculate the total sum of the array
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }

        int leftSum = 0;

        for (int i = 0; i < n; i++) {
            // Reduce totalSum by the current element
            totalSum -= arr[i];

            if (leftSum == totalSum) {
                return i; // Equilibrium point found at index 'i'
            }

            leftSum += arr[i];
        }

        return -1; // No equilibrium point found
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 2};
        int equilibriumIndex = equilibrium(arr);

        if (equilibriumIndex != -1) {
            System.out.println("Equilibrium point found at index " + equilibriumIndex);
        } else {
            System.out.println("No equilibrium point found in the array");
        }
    }
}
