import java.util.Scanner;

public class qqtext {
public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	System.out.println("请输入QQ等级");
	int i = scan.nextInt();
	if(i==1)
		System.out.println("活跃天数5天");
	else if(i==4)
		System.out.println("活跃天数32天");
	else if(i==8)
		System.out.println("活跃天数96天");
	else if(i==12)
		System.out.println("活跃天数192天");
	else if(i==16)
		System.out.println("活跃天数320天");
	else if(i==32)
		System.out.println("活跃天数1152天");
	else if(i==48)
		System.out.println("活跃天数2496天");
	else if(i==64)
		System.out.println("活跃天数4352天");
	else 
			System.out.println("未知");
}
}
