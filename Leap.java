import java.util.Scanner;
public class Leap{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter a year to check Whether is a Leap year or not");
        int num1=sc.nextInt();
        if(num1%4==0)
        {
            System.out.println(num1+"\sis a leap Year");
        }
        else
        {
            System.out.println(num1+"\sis not a Leap Year");
        }
        sc.close();

    }
}
