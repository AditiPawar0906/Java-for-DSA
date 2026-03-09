import java.util.Scanner;
public class num_guessing{
    public static void num_gess_game()
    {
      Scanner sc= new Scanner(System.in);
      int number= 1 + (int)(100 * Math.random());
      int k=5;
      System.out.println("You have to guess the correct number between 1-100");
      System.out.println(" You have only " + k + " attempts to guess the correct number");
        for(int i=0;i<k;i++)
        {
            System.out.println("Enter your guess:");
            int guess= sc.nextInt();

            if(guess==number)
            {
                System.out.println("Congratulations!!!... you guessed the correct number.");
                sc.close();
                return;

            }
            else if(guess<=number)
            {
                System.out.println("Then number is greater than"+ guess);
            }
            else{
                System.out.println("The number is less than" + guess);
                
            }
        }
        System.out.println("Oops you exhausted all the attempts...better luck next time");
        System.out.println("\nThe correct answer was " + number);
        sc.close();

    }
    public static void main(String args[])
    {
        num_gess_game();
    }
    
}