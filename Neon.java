import java.util.Scanner;

public class Neon{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Eter a number to check whether its a neon number or not");
        
        int n= sc.nextInt();
        int sq= n*n;
        int sum=0;
        while(sq>0)
        {
            int digit=sq%10;
            sum= sum+digit;
            sq=sq/10;
        
        }
        if(sum==n)
        {
         System.out.println(n   + "is a neon number");
        }
        else{
            System.out.println("the number is not a neon number");
        }



        sc.close();
    }
}