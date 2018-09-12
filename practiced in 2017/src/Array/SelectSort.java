package Array;
public class SelectSort {
	public static int[] sort(int [] a,String str){
		if(str.equalsIgnoreCase("Ð¡")){
			for(int i=0;i<a.length;i++){
				for(int j=i+1;j<a.length;j++){
					if(a[i]>a[j]){
						int x=a[i];
						a[i]=a[j];
						a[j]=x;
					}
				}
			}
		}
		if(str.equalsIgnoreCase("´ó")){
			for(int i=0;i<a.length;i++){
				for(int j=i+1;j<a.length;j++){
					if(a[i]<a[j]){
						int x=a[i];
						a[i]=a[j];
						a[j]=x;
					}
				}
			}
		}
		return a;
	}
	public static void main(String[] args) {
		int [] a=sort(new int[]{1,2,3,4,5,6,7,8,9},"´ó");
		for(int y=0;y<a.length;y++){
			System.out.print(a[y]+" ");
		}
	}

}
