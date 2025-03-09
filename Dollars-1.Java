import java.util.Scanner;

public class dollars{

    public static void main(String[]args){
        
        Scanner input= new Scanner(System.in);
        
        System.out.print("Enter the dollar amount: ");
        int dollars= input.nextInt();
        

        System.out.println("$20 bills: " +(dollars/20));
        dollars %=20;
        
        System.out.println("$10 bills: " +(dollars/10));
        dollars %=10;
        
        System.out.println("$5 bills: " +(dollars/5));
        dollars %=5;
        
        System.out.println("$1 bills: " +dollars);
        
    }
}