class PointDemo
{
	public static void main(String args[])
	{
	  Point P2=new Point(7,8);
	  Point P3=new Point(10,15,20,22);
	  double d1;
	 /* P2.Setx1(5);
	  P2.Sety1(7);
	  P3.Setx2(9);
	  P4.Setx4(10); */
	  d1 = P3.Distance(P2);
	  System.out.print(d1);
	}
}