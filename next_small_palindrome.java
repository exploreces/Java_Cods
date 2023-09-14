public class next_small_palindrome {
    
        public static void main(String[] args) {
            long inputNumber = 23545;
            long nextSmallestPalindrome = findNextSmallestPalindrome(inputNumber);
            System.out.println("Next Smallest Palindrome: " + nextSmallestPalindrome);
        }
    
        public static long findNextSmallestPalindrome(long num) {
            while (true) {
                num++; // Increment the number
    
                if (isPalindrome(num)) {
                    return num; // If it's a palindrome, return it
                }
            }
        }
    
        public static boolean isPalindrome(long num) {
            long originalNum = num;
            long reversedNum = 0;
    
            while (num > 0) {
                long remainder = num % 10;
                reversedNum = reversedNum * 10 + remainder;
                num /= 10;
            }
    
            return originalNum == reversedNum;
        }
    }
    

    // input in the form of array format.

    /*
     * public class NextSmallestPalindrome {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 5};
        int[] nextSmallestPalindrome = findNextSmallestPalindrome(inputArray);
        System.out.print("Next Smallest Palindrome: ");
        for (int num : nextSmallestPalindrome) {
            System.out.print(num);
        }
    }

    public static int[] findNextSmallestPalindrome(int[] numArray) {
        while (true) {
            numArray = incrementArray(numArray); // Increment the array

            if (isPalindrome(numArray)) {
                return numArray; // If it's a palindrome, return it
            }
        }
    }

    public static int[] incrementArray(int[] numArray) {
        int carry = 1;

        for (int i = numArray.length - 1; i >= 0; i--) {
            int sum = numArray[i] + carry;
            numArray[i] = sum % 10;
            carry = sum / 10;

            if (carry == 0) {
                break; // No need to carry further
            }
        }

        if (carry != 0) {
            // Need to add a new digit at the beginning
            int[] newArray = new int[numArray.length + 1];
            newArray[0] = carry;
            System.arraycopy(numArray, 0, newArray, 1, numArray.length);
            return newArray;
        }

        return numArray;
    }

    public static boolean isPalindrome(int[] numArray) {
        int left = 0;
        int right = numArray.length - 1;

        while (left < right) {
            if (numArray[left] != numArray[right]) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}

     */
    

