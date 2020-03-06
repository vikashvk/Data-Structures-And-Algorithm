class MergeSort{
    public static void main(String[] args) {
        int[] unsortedArray={ 19, 39,-20, 13, 43, 76, 67, 48, -22};
        int start=unsortedArray[0];
        int end=unsortedArray[unsortedArray.length-1];
        mergeSort(unsortedArray, start, end);
        for(int i=0;i<unsortedArray.length;i++){
            System.out.println(unsortedArray[i]);
        }

    }
    // 19, 39,-20, 13, 43, 76, 67, 48, -22
    public static void mergeSort(int[] input, int i, int j) {
        if(j-i<2)
        return;

        int mid=(i+j)/2;
        mergeSort(input, i, mid);
        mergeSort(input, mid, j);
        merge(input, i, mid, j);
    }
    // 19, 39,-20, 13, 43, 76, 67, 48, -22
    public static void merge(int[] input, int i, int mid, int j){
        if(input[mid-1]<=input[mid])
        return;
        
        input[mid-1]=input[mid-1]+input[mid];
        input[mid]=input[mid-1]-input[mid];
        input[mid-1]=input[mid-1]-input[mid];
        
        merge(input, i, mid, j);

    }
}