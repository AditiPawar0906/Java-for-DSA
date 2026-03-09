
import java.util.Scanner;
public class Evenodd{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number\n ");
    
        int num1=sc.nextInt();
        if(num1%2==0)
        {
            System.out.println(num1 +"\s number is even");
        }
        else{
            System.out.println(num1+"\snumber is odd");
        }
       sc.close(); 
    }

}