class Operator {
    public static void main(String[] args) {
        
        int a,b,c,d,e,f;
        int number1 = 1, number2 = 2, number3 = 9;
        boolean result;
        
        a=5 ;
        b=6 ;
        c=a+b;
        
        c=a+b;
        d=1;
        e=0;
        f=d+e;
        System.out.println(c);
        System.out.println(f);
        result = (number1 > number2) || (number3 > number1);
        System.out.println(result);
        result = (number1 > number2) && (number3 > number1);
        System.out.println(result);



    }
}