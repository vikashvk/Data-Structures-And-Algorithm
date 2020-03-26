class BubbleSort{
    public static void main(String[] args) {
        int[] unsortedArray={ 19, 39,-20, 13, 43, 76, 67, 48, -22};
        for (int unsortedIndex = 0; unsortedIndex < unsortedArray.length-1; unsortedIndex++) {
            // for(int x=unsortedArray.length/2; x>0; x=2){
            //     int largest=0;
            //     if(unsortedArray[x]==unsortedArray[largest]){
            //     }
            // }
            for (int j = 0; j < unsortedArray.length-unsortedIndex-1; j++) {
               if(unsortedArray[j]>unsortedArray[j+1]){
                   swap(unsortedArray, j, j+1);
               } 
            }
        }

        for(int i=0; i<unsortedArray.length; i++)
        System.out.println(unsortedArray[i]);
    }
     public static void swap(int[] arr, int i, int j){
            if(i== j)
            return;

            arr[i]= arr[i]+arr[j];
            arr[j]= arr[i]-arr[j];
            arr[i]= arr[i]-arr[j];
        }
}