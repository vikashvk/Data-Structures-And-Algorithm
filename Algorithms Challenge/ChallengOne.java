public class ChallengOne {
    public static void main(String[] args) {
		
	    int Unsortedarr[]={5,9,3,7,2,8};
	    System.out.println("UnSorted Array :");
		for(int i=0;i<Unsortedarr.length;i++)
		System.out.print(Unsortedarr[i] + " ");
		System.out.println();
		quicksort(Unsortedarr,0,Unsortedarr.length-1);
        System.out.println("Sorted Array 'Desc' :");
		for(int i=0;i<Unsortedarr.length;i++)
		System.out.print(Unsortedarr[i] + " ");
       
	}

    static int partition(int[] arr,int p ,int q){
		int x=arr[p];//first element as pivot
		int i=p,temp; 
		for(int j=p+1;j<q+1;j++){
			if(arr[j]>=x){
				++i;
				temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp;
			}
		}
		temp = arr[i]; 
        arr[i] = arr[p]; 
        arr[p] = temp;
		return i;
	}
		
	static void quicksort(int[] arr,int p,int q){
		if(p<q){
			int m=partition(arr,p,q);
			quicksort(arr,p,m-1);
			quicksort(arr,m+1,q);
		}

	}
  }
}
