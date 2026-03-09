public class Binary {
    public static void main(String[] args){
        String x="011011";
        String y="1010111";
        int num1=Integer.parseInt(x,2);
        int num2=Integer.parseInt(y,2);
        int sum=num1+num2;
        String result=Integer.toBinaryString(sum);
        System.out.println("The sum of two Binary String is:"+result);



    }
    
}
