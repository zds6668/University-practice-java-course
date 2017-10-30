class Circle 
{double pi = 3.14;
double r;
double s;
public void getare(){
	s=r*r*pi;
	System.out.println(s);
}public static void main(String[] args){
	Circle o1;
	o1=new Circle();
	o1.r=3;
	o1.getare();
}
}

