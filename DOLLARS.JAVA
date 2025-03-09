import java.util.Scanner;

public class Dola{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the dollar amount: ");
        int dollars= input.nextInt();

        int num20s= dollars/20;
        int remainder= dollars%20;

        int num10s= remainder/10;
        remainder= remainder%10;

        int num5s= remainder/5;
        remainder= remainder%5;

        int num1s= remainder;

        System.out.println("The $20 bills is: " + num20s);
        System.out.println("The $10 bills is: " + num10s);
        System.out.println("The $5 bills is: " + num5s);
        System.out.println("The $1 bills is: " + num1s);

        
    }
}