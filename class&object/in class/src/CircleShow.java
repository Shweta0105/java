class Circle
{ 
 int radius=10;
 double findArea()
 {
 return(3.14*radius*radius);
 }
	double findCircumference()
	{
	return(6.28*radius);
	}
	void toDisplay()
	{ double a,b;
		a=findArea();
		b=findCircumference();
	System.out.println("area :" +a);
	System.out.println("circumference :" +b);
	}
}
class CircleShow
{
	public static void main(String args[])
	{Circle ques=new Circle ();
	 ques.findArea();
	 ques.findCircumference();
	ques.toDisplay();
	}
}