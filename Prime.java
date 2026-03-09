import java.util.Scanner;

public class Prime{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
     System.out.println("Enter number you want print prime number from ");
     int n=sc.nextInt();
      for(int num=2;num<n;num++)
      {
        boolean prime=true;
        for (int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                prime=false;
                break;
            }
        }
        if(prime)
            System.out.println(num+"");
      }

      
     
     
     sc.close();

}
}