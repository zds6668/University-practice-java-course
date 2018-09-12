package Array;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
public class Sequence {
	public static void main(String[] args) throws IOException{
		String m=new String("");
		int[] a={0,0,0};
		BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("输入三个数以空格隔开");
		m=stdin.readLine();
		Scanner scan=new Scanner(m);
		for(int i=0;i<3;i++){
			a[i]=scan.nextInt();
		}
		Arrays.sort(a);//数组排序方法
		System.out.print("数字升序排列为");
		for(int i=0;i<3;i++){
			System.out.print(a[i]+" ");
		}
	}

}
