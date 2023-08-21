
import java.util.* ;
import java.io.*; 

//  Wap to make the given array non-decreasing by modifying at most one element

public class non_dec {
	public static boolean isPossible(int[] arr, int n) {
    int count = 0;
    for (int i = 1; i < n; i++) {
        if (arr[i] < arr[i - 1]) {
            count++;
        }
    }

    if (count > 1) {
        return false;
    }
    return true;
}

    
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number of elements in the array: ");
    int n = scanner.nextInt();

    int[] arr = new int[n];
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < n; i++) {
        arr[i] = scanner.nextInt();
    }

    boolean result = isPossible(arr, n);

    if (result) {
        System.out.println("It is possible to make the array non-decreasing by modifying at most one element.");
    } else {
        System.out.println("It is not possible to make the array non-decreasing by modifying at most one element.");
    }

    scanner.close();
}
}
 






