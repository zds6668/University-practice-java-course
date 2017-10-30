package Array;
public class MatrixTranspose {

	public static void main(String[] args) {
		int a[][] = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("转置前的矩阵");
	for(int i=0;i<a.length;i++){
		for(int j=0;j<a.length;j++){
			System.out.print(a[i][j]+" ");
		}System.out.println();
	}
	int b[][]=new int[a.length][a.length];
	for(int i=0;i<a.length;i++){
		for(int j=0;j<a[i].length;j++){
			b[i][j]=a[j][i];
		}
	}
	System.out.println("转置后");
	for(int i=0;i<a.length;i++){
		for(int j=0;j<a.length;j++){
			System.out.print(b[i][j]+" ");
		}System.out.println();
	}
		
	}}

