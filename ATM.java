import java.util.*;

public class ATM 
{
    public static void main(String args[])
    {
        int pin = 1234;
        int balance = 10000;

        int AddAmount = 0;
        int TakeAmount = 0;

        String name;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Pin Number");
        int password = scan.nextInt();

        if(password == pin)
        {
            System.out.println("Enter your name");
            name = scan.next();
            System.out.println("welcome " + name);

            while (true) 
            {
                System.out.println("Press 1 to check your balance");
                System.out.println("Press 2 to add amount");
                System.out.println("Press 3 to take amount");
                System.out.println("Press 4 to take receipt");
                System.out.println("Press 5 to EXIT");

                int opt = scan.nextInt();
                switch(opt)
                {
                    case 1:
                        System.out.println("Your current balance is " + balance);
                        break;
                    case 2:
                        System.out.println("How much amount did you want to ADD to your account");
                        AddAmount = scan.nextInt();
                        System.out.println("Successfully credited");
                        balance = AddAmount + balance;
                        break;
                    case 3:
                        System.out.println("How much amount did you want to take");
                        TakeAmount = scan.nextInt();

                        if(TakeAmount > balance)
                        {
                            System.out.println("Your balance is insufficient");
                            System.out.println("try less than your available balance");   
                        }
                        else 
                        {
                            System.out.println("Successfully taken");
                            balance = balance - TakeAmount;
                        }
                        break;
                    case 4:
                        System.out.println("Welcome to all in one mini ATM");
                        System.out.println("Available balance is " + balance);
                        System.out.println("Amount deposited     " + AddAmount);
                        System.out.println("Amount taken         " + TakeAmount);
                        System.out.println("Thanks for coming");
                        break;
                    default:
                        System.out.println("press the number below 5");
                        break;

                 }
                 if (opt == 5)
                 {
                    System.out.println("Thankyou");
                    break;
                 }
            }
        }
        else
        {
            System.out.println("Worng pin number");
        }
    }
}