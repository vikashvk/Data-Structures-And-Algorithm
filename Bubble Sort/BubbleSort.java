class BubbleSort{
    public static void main(String[] args) {
        int[] unsortedArray={ 19, 39,-20, 13, 43, 76, 67, 48, -22};

        // for(int)
        System.out.println(unsortedArray);
    }
     public static void swap(int[] arr, int i, int j){
            if(i== j)
            return;

            arr[i]= arr[i]+arr[j];
            arr[j]= arr[i]-arr[j];
            arr[i]= arr[i]-arr[j];
        }
    
}