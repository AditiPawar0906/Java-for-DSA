import java.util.Scanner;
public class GCD{
    static int Eg (int a, int b)
    {
        
        if(a==0) 
            return b;
        if(b==0)
            return a;

        if(a==b)
            return a;
        if (a>b)
            return Eg(a-b,b);
        return Eg(a,b-a);
 }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value for a:");
        int a=sc.nextInt();
        System.out.println("Enter value for b:");
        int b= sc.nextInt();
        System.out.println("GCD of\s"+a+" and "+b+" is:- "+Eg(a,b));
        sc.close();
        

    }
}
