import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffer_eg{
    public static void main(String[] args)
    throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
       
        System.out.println("please enter the value");
         int number=Integer.parseInt(reader.readLine());
        System.out.println("the entered number is:"+number);



    }
}
