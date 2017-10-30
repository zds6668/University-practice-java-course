class Circle 
{
	private double r;
	public void setR(double r)
	{
		this.r=r;
	}
	public double getArea()
	{
		return Math.PI*r*r;
	}
	public double getPerimeter()
	{
		return 2*Math.PI*r;
	}
                public double getRadius()
                {
                      return r;
                 }
	public static void main(String args[])
	{	
		Circle c1=new Circle();
		Circle c2=new Circle();
		c1.setR(50);
		c2.setR(80);
		System.out.printf("c1面积为：%.3f\r\n",c1.getArea());
		System.out.printf("c1周长为：%.3f\r\n",c1.getPerimeter());
		System.out.printf("c2面积为：%.3f\r\n",c2.getArea());
		System.out.printf("c2周长为：%.3f\r\n",c2.getPerimeter());	
	}
}