import java.util.Scanner;
public class oddeven {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("������һ������");
		long number=scan.nextLong();
		String check=(number%2==0)?"���������ż��":"�������������";
		System.out.println(check);
	}
	

}