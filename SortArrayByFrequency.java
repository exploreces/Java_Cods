import java.util.*;

public class SortArrayByFrequency {

    public static void sortByFrequency(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Create a custom comparator to sort by frequency and element value
        Comparator<Integer> customComparator = (a, b) -> {
            int freqCompare = frequencyMap.get(a).compareTo(frequencyMap.get(b));
            if (freqCompare == 0) {
                return Integer.compare(b, a);
            }
            return freqCompare;
        };

        // Sort the array using the custom sorting logic
        mergeSort(arr, 0, arr.length - 1, customComparator);
    }

    public static void mergeSort(int[] arr, int left, int right, Comparator<Integer> comparator) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid, comparator);
            mergeSort(arr, mid + 1, right, comparator);
            merge(arr, left, mid, right, comparator);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right, Comparator<Integer> comparator) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (comparator.compare(leftArray[i], rightArray[j]) <= 0) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};

        System.out.println("Original Array: " + Arrays.toString(arr));

        sortByFrequency(arr);

        System.out.println("Array Sorted by Frequency: " + Arrays.toString(arr));
    }
}


    

