
public class yanghui {

	public static void main(String[] args) {
int t[][] = new int [10][];
for(int i =0;i<t.length ;i++){
	t[i]= new int[i+1];
for(int j=0;j<=i;j++){
	if(i==0||j==0||j==i){
		t[i][j]=1;
	}else{
		t[i][j]=t[i-1][j-1]+t[i-1][j];
	}
	System.out.print(t[i][j]+"\t");
}System.out.println("");
}
	}

}
