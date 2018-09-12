package Array;
import java.util.Scanner;
public class Jiugongge {
	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
	int x=s.nextInt();
	int h=0;
	int l=x/2;
	int[][]a=new int[x][x];
	for(int i=1;i<=x*x;i++){
		a[h][l]=i;
	h--;l++;
	if(h<0&&l>=x){
		h++;
		l--;
		h++;
	}
	else if(h<0){
		h=x-1;
	}
	else if(l>=x){l=0;
	}
	else if(a[h][l]>0){//右上方有数存在，则返回原数，下移一行
	h++;l--;h++;}
	}for(int j=0;j<x;j++){
		for(int m=0;m<x;m++){
			System.out.print(a[j][m]+" ");
		}System.out.println();
	}
	}

}
