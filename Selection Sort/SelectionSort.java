class SelectionSort {
    public static void main(String[] args) {
        int[] unsortedArray={ 19, 39,-20, 13, 43, 76, 67, 48, -22};

        for (int unsortedIndex = unsortedArray.length - 1; unsortedIndex > 0; unsortedIndex--) {
		    int largest=0;
            
            for(int j=0; j<=unsortedIndex;j++){
                if(unsortedArray[j]>unsortedArray[largest])
                largest=j;
            
        }
        swap(unsortedArray, largest, unsortedIndex);
    }
        for(int i=0;i<unsortedArray.length;i++){
            System.out.println(unsortedArray[i]);
        }
    }
    public static void swap(int[] arr, int i, int j){
        if(i==j)
        return;

        arr[i]=arr[i]+arr[j];
        arr[j]=arr[i]-arr[j];
        arr[i]=arr[i]-arr[j];
    }
}