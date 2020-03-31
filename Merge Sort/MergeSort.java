class MergeSort{
    public static void main(String[] args) {
        int[] unsortedArray={ 19, 39,-20, 13, 43, 76, 67, 48, -22};
        // int start=unsortedArray[0];
        // int end=unsortedArray[unsortedArray.length-1];
        mergeSort(unsortedArray, 0, unsortedArray.length);
        for(int i=0;i<unsortedArray.length;i++){
            System.out.println(unsortedArray[i]);
        }
    }
    
    // 19, 39,-20, 13, 43, 76, 67, 48, -22
    public static void mergeSort(int[] input, int start, int end) {
        if(end-start<2)
        return;

        int mid=(start+end)/2;
        mergeSort(input, start , mid);
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
    }
    // 19, 39,-20, 13, 43, 76, 67, 48, -22
    public static void merge(int[] input, int start, int mid, int end){
        if(input[mid-1]<=input[mid])
        return; 
        int i=start;
        int j=mid;
        int tempIndex=0;
        int[] tempArray=new int[end-start];
        while(i<mid && j<end)
        tempArray[tempIndex++]=input[i]<=input[j]? input[i++] : input[j++];
        System.arraycopy(input, i, input, start+tempIndex, mid-i);
        System.arraycopy(tempArray, 0, input, start, tempIndex);
    }
}