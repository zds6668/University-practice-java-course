import java.util.Scanner;
public class JudgeSeason {
	public static void main(String[] args){ 
		Scanner scan = new Scanner(System.in);
	System.out.println("ÇëÊäÈëÔÂ·İ");
int mouth = scan.nextInt();
switch (mouth){
	case 12:
	case 1:
	case 2:
		System.out.println("¶¬¼¾");
		break;
	case 3:
	case 4:
	case 5:
		System.out.println("´º¼¾");
		break;
	case 6:
	case 7:
	case 8:
		System.out.println("ÏÄ¼¾");
		break;
	case 9:
	case 10:
	case 11:
		System.out.println("Çï¼¾");
		break;
		default:
			System.out.println("´íÎó");
}
	}

}
