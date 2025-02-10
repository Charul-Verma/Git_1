package inbox;

class Sort{
	public static void main(String[] args) {
		int[] arr={​​3,2,5,9,1,0};
		int temp=0;
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]<arr[j]){
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		for(int i=0;i<arr.length-1;i++){
			System.out.println(arr[i]);
		}

	}

}
