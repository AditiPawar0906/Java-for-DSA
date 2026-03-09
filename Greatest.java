import java.util.Scanner;
public class Greatest{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num1:\s");
        int num1=sc.nextInt();
        System.out.println("Enter num2:\s");
        int num2=sc.nextInt();
        System.out.println("Enter num3:\s");
        int num3=sc.nextInt();
        if(num1==num2 && num1==num3 && num2==num3)
        {
        System.out.println("All are same values enter another values");
        }
        else if(num1>num2 && num1>num3){
            
            System.out.println(num1+"\s is Greater");
        
    }
    else if(num2>num3)
    {
        System.out.println(num2+"\sis Greater");
    }
    else
    {
        System.out.println(num3+"\sis Greater");
    }

sc.close();
    }

}