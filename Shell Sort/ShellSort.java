class ShellSort{
    public static void main(String[] args) {
        int[] unsortedArray={ 19, 39,-20, 13, 43, 76, 67, 48, -22};
        //Not Using Knuth Sequence    
        for(int gap=unsortedArray.length/2;gap>0;gap/=2){
            for(int i=gap;i<unsortedArray.length; i++){
                int newElement=unsortedArray[i];
                int j=i;
                while (j>=gap && unsortedArray[j-gap]> newElement) {
                    unsortedArray[j]=unsortedArray[j-gap];
                    j-=gap;
                }
                unsortedArray[j]=newElement;                                
            }

        }

        for(int i=0; i<unsortedArray.length;i++){
            System.out.println(unsortedArray[i]);
        }
    }
}