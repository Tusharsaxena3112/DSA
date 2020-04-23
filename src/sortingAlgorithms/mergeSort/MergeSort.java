package sortingAlgorithms.mergeSort;

public class MergeSort {
    private int[] arr;
    private int[] crr;

    public MergeSort(int[] array) {
        this.arr = array;
        crr = new int[arr.length];
    }

    public void mergeSort(int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            mergeSort(low, mid);
            mergeSort(mid + 1, high);
            merge(low, mid, high);
        }

    }

    public void merge(int low, int mid, int high) {
        for (int i = low; i <= high; i++) {
            crr[i] = arr[i];
        }
        int i = low;
        int j = mid + 1;
        int k = low;
        while (i <= mid && j <= high) {
            if (crr[i] <= crr[j]) {
                arr[k] = crr[i];
                k++;
                i++;
            } else {
                arr[k] = crr[j];
                k++;
                j++;
            }
        }
        while (i <= mid) {
            arr[k] = crr[i];
            i++;
            k++;
        }
        while (j <= high) {
            arr[k] = crr[j];
            k++;
            j++;
        }
    }

//    public int[] merge(int[] arr,int[] brr){
//        int[] crr = new int [arr.length+brr.length];
//        int i=0,j=0;
//        int k=0;
//        while(i<arr.length && j<brr.length){
//            if(arr[i]<brr[j]){
//                crr[k] = arr[i];
//                k++;
//                i++;
//            }
//            else{
//                crr[k] = brr[j];
//                k++;
//                j++;
//            }
//        }
//        if(j<brr.length){
//            while(j<brr.length){
//                crr[k] = brr[j];
//                k++;
//                j++;
//            }
//        }
//        else{
//            while(i<arr.length){
//                crr[k] = arr[i];
//                k++;
//                i++;
//            }
//        }
//        return crr;
//    }
}
