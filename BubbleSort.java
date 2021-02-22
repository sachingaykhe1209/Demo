
class BubbleSort{
	public static void main(String args[]){
		int a[] = { 64, 34, 25, 12, 22, 11, 90 }; 
        int i,j,n = a.length;
		int temp;
		for(i=0;i<n-1;i++){
			int flag=0;
			for(j=0;j<n-1-i;j++){
				
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=1;
				}
				
			}
			if(flag == 0){
				break;
			}
		}
		
		System.out.println("Sorted Array: ");
		for (i = 0; i < n; i++) 
            System.out.print(a[i] + " "); 
        System.out.println(); 
	}	
}