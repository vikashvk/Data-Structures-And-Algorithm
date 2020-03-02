class InsertionSort{
    public static void main(String[] args) {
        int[] unsortedArray={19, 39,-20, 13, 43, 76, 67, 48, -22};
        
        for(int unsortedIndex=1; unsortedIndex<unsortedArray.length;unsortedIndex++){
            int newElement=unsortedArray[unsortedIndex];
            int i;
            for(i=unsortedIndex; i>0 && unsortedArray[i-1]>newElement;i--){
                unsortedArray[i]=unsortedArray[i-1];
            }
            unsortedArray[i]=newElement;
        }
        for(int i=0; i<unsortedArray.length;i++){
            System.out.println(unsortedArray[i]);
        }
    }
}