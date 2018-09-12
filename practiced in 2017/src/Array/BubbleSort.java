package Array;
public class BubbleSort {
	public void sortArry()
	{
		int arr[]={2,3,7,1,534,23,75,6};
		System.out.println("排序前结果是");
		for(int i =0;i<arr.length;i++){System.out.print(arr[i]+" ");}
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[i]>arr[j+1]){
					int t=arr[i];
					arr[i]=arr[j+1];arr[j+1]=t;
				}
			}
		}System.out.println();
		System.out.println("排序后结果是");
		for(int i =0;i<arr.length;i++){System.out.print(arr[i]+" ");}
	}
	public static void main(String[] args) {
		BubbleSort b=new BubbleSort();
		b.sortArry();
	}

}
