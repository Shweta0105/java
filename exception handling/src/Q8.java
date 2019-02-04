import java.util.*;
import java.io.*;

class Exception1 extends Exception 
{
	Exception1(String s) 
	{ 
	super(s);
	}
}

class Exception2 extends Exception 
{
	Exception2(String s) 
	{ 
	super(s); 
	}
}

public class Q8
{
	static void f() throws Exception2
	{
			try 
			{
				g();
			}
			 catch(Exception1 e1) 
			{
				System.out.println("Caught Exception1 in f inner try");
				System.out.println(e1);
				throw new Exception2("from f() inner try");
			}
		
	}
	static void g() throws Exception1 {
		throw new Exception1("from g()");
	}
	public static void main(String[] args)
	 {
		try
			{	
				f();
			}
		catch(Exception2 e2) 
		{
			System.out.println("Caught Exception2 in f() outer try");
			System.out.println(e2);
		}
	}	
}