package text5_9;
public class Monkeyperch {
public static void main(String[] args){
	System.out.println(s(10));
}
static int s(int i){
	int x=i;
	for(int j=0;j<5;j++){
		if(i%5-1!=0)return s(x+1);
		i=(i-1)/5*4;
	}
	return x;
	
}
}
