package searchingTechniques;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 1, 2, 3, 4, 1};
        Arrays.sort(arr);
        int lower = 0;
        int higher = arr.length;
        int search = 0;
        while (lower < higher) {
            int mid = (lower + higher) / 2;
            if (arr[mid] == search) {
                System.out.println("Present");
                break;
            }
            if (search > arr[mid]) {
                lower = mid + 1;
            } else if (search < arr[mid]) {
                higher = mid - 1;
            }
        }
    }
}
