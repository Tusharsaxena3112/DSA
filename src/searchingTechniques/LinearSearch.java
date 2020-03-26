package searchingTechniques;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 56, 7};
        int searchElement = 5;
        boolean response = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchElement) {
                response = true;
                break;
            }
        }
        if (response == true) {
            System.out.println("Present");
        } else {
            System.out.println("Not Present");
        }
    }
}
