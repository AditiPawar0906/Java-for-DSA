import java.util.Scanner;
public class LCM{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a=sc.nextInt();
        System.out.println("Enter the value of b:");
        int b= sc.nextInt();

       
         int ans=a>b?a:b;

        while(true){
            if(ans%a==0 && ans%b==0)
            {
                break;
            }
            ans++;
        }
        System.out.println("LCM of\s"+a +" and\s"+b+" is:-\s"+ans);
        sc.close();
    }

}