import java.util.Scanner;
public class Encryption {
public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	System.out.println("请输入一个英文字符串或解密字符串");
	String password= scan.nextLine();
	char[] array=password.toCharArray();
	for(int i=0;i<array.length;i++)
		{array[i]=(char)(array[i]^20000);}
	System.out.println("结果如下");
System.out.println(new String(array));	
}

}

