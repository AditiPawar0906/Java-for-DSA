public class Octal{
    public static void main(String[] args)
    {
        String x="157";
        String y="246";

        int num1=Integer.parseInt(x,8);
        int num2=Integer.parseInt(y,8);

        int sum=num1+num2;

        String result=Integer.toOctalString(sum);
        System.out.println("The Addition of two Octal String is:"+result);
        



    }
}