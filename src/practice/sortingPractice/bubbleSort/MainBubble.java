package practice.sortingPractice.bubbleSort;

public class MainBubble {
    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 5, 1};
        BubbleSort bubbleSort = new BubbleSort(arr);
        bubbleSort.sort();
    }
}
