import java.util.Arrays;
public class BinaryTree {

    // TODO complete this method
    public static boolean isBST(int[] arr, int currIndex, int lowerBound, int upperBound) {
        if (currIndex >= arr.length) {
            return true;
        } else {
            if (arr[currIndex] < upperBound && arr[currIndex] > lowerBound) {
                //System.out.println("cake!!");
                boolean checkLeft = isBST(arr, currIndex * 2, lowerBound, arr[currIndex]);
                boolean checkRight = isBST(arr, currIndex * 2 + 1, arr[currIndex], upperBound);
                if (!checkLeft || !checkRight) {
                    return false;
                }
                return true;
            } else {
                return false;
            }
        }
    }
    public static boolean isValid(int[] arr) {
        return isBST(arr, 1, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static void main (String args[]) {
      // milestone 1
      int[] arr1 = new int[]{-1,7,4,10,3,6,8,15};
      int[] arr2 = new int[]{-1,20,12,32,5,18,25,38};
      int[] arr3 = new int[]{-1,11,3,33,2,8,10,44};
      int[] arr4 = new int[]{-1,55,44,77,33,48,54,95,22,34,45,57,53,70,85,98};

      System.out.println("arr1 valid: " + isValid(arr1));  // expected: true
      System.out.println("arr2 valid: " + isValid(arr2));  // expected: true
      System.out.println("arr3 valid: " + isValid(arr3));  // expected: false
      System.out.println("arr4 valid: " + isValid(arr4));  // expected: false
    }
}
