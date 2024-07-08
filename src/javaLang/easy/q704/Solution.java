package javaLang.easy.q704;

// 704 #easy #Binary Search #java #CoreConcept
public class Solution {
    public static int binarySearch(int[] array, int target){
        int left=0, right = array.length - 1;
        while (left <= right){
            int mid = left + (right - left)/2;
            if(array[mid] == target) {
                return mid;
            }
            if(array[mid] < target){
                left = mid + 1;
            }else {
                right = mid -1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int target = 7;

        int result = binarySearch(array, target);

        if (result == -1) {
            System.out.println("Target not found in the array.");
        } else {
            System.out.println("Target found at index: " + result);
        }
    }
}
