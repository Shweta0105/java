class Box{
   public static double width;
   public static double height;
   public static double depth;
  static void setDim ()
  
 {
    width=9;
    height=7;
    depth=6;
 }
  static double volume()
  {
    return (width*height*depth);
  }
 }
   class BoxDemo
  {
    public static void main(String args[])
    {
       
       double d;
       Box.setDim();
       Box.width=5;
       d=Box.volume();
       System.out.print("Box.volume()"+d);
       
    }
  }