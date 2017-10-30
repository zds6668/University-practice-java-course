import java.util.Scanner;
public class judge {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("输入一个年份");
		long year;
		try{
			year = scan.nextLong();
			if(year%4==0&&year%100!=0||year%400==0){
				System.out.println(year+"是闰年");
			}
			else{
				System.out.println(year+"不是闰年");
			}
		}catch (Exception e){System.out.println("输入年份有误");}
	
	}

}
