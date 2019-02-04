 class CheckArgumentException extends Exception
{
	CheckArgumentException(String s)
	{
	super();
	}

}
class Comand{
	public static void main(String args[])
	{int sum=0;
	int a[]=new int[5];
	try
	{int count=0;
	for(int i=0;i<a.length;i++){
	a[i]=Integer.parseInt(args[i]);
	sum+=a[i];
	count++;}
   if(count!=5)
   throw new CheckArgumentException("system error");
   }
   catch(CheckArgumentException e)
{
	System.out.println("exception is:"+e);
}

	}
	}