class Exception1 extends Exception 
class Exception2 extends Exception1 
class Exception3 extends Exception2  

class A 
{
	void f() throws Exception1
    {
		throw new Exception1();
	}
}

class B extends A
 {
	void f() throws Exception2
	{
		throw new Exception2();
	}
}

class C extends B 
{
	void f() throws Exception3
	{
		throw new Exception3();
	}
}

public class Q5 {
	public static void main(String[] args) {
		A a = new C();
		try {
			a.f();
		}	catch(Exception3 e3) {
			System.out.println("Caught e3");			
		}	catch(Exception2 e2) {
			System.out.println("Caught e2");
		}	catch(Exception1 e1) {
			System.out.println("Caught e1");
		}		
	}
}