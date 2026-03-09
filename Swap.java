
import java.util.Scanner;
public class Swap{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=0;
        System.out.println("the value of a and b before swap is\n a is:"+a+"\n b is:"+b);
        
         c=a;
         a=b;
         b=c;
         System.out.println("the value after swap :\n a is:"+a+"\n b is :"+b);
        sc.close();
    }
}