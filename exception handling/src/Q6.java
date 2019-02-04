import java.util.*;
import java.io.*;
class Q6
 {
     Q6() throws IOException 
    {
        throw new IOException();
    }
}

class Derived extends Q6
{
    Derived() throws IOException
        { 
            super();
        }
        
     public static void main(String[] args) 
     { 
        try
        {
       Derived ob=new Derived(); 
      }
      catch(Exception e)
      {
          System.out.println("brozoned");
      }
}
}