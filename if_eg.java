import java.util.Scanner;
public class if_eg{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is greater than 100");
        int a=sc.nextInt();
        if(a>=100)
        {
            System.out.println(a + "is greater than 100");
        }
        else{
            System.out.println(a +  "is less than 100");
        }

        sc.close(); 
    }

    
}