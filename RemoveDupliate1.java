class RemoveDupliate1  
{
	public static void main(String[] args) 
	{
		int arr[]={1,2,3,3,4,5,6,4,3,2,12,234,23,34,12,5,23,23,23,34};
		int temp=0;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length-1;i++){
			
			if(arr[i]!=arr[i+1])

			System.out.println(arr[i]);
		}
		System.out.println(arr[arr.length-1]);



		//System.out.println("Hello World!");
	}
}
