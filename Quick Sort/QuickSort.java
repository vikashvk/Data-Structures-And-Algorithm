public class QuickSort{
    public static void main(String[] args) {
        int[] unsortedArray = { 19, 39, -20, 13, 43, 76, 67, 48, -22 };
        for (int i = 0; i < unsortedArray.length; i++) {
            System.out.println(unsortedArray[i]);        
        }
    }
        public static void quickSort(int[] input, int start, int end) {
        if(end- start<2)
        return;    

        int pivotIndex=partition(input, start, end);
        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex+1, end);
    }

    private static int partition(int[] input, int start, int end) {
        return 0; 
    }
}
