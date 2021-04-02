import java.util.Scanner;

public class PalindromeMain
{
    public static void main(String[] args){  
        PalindromeCheck checker = new PalindromeCheck(); 

        Scanner sc = new Scanner(System.in); 

        System.out.println("Please enter a number between 1 - 999999999 (inclusive) to check if it is a palindrome: ");
        String numberInput = sc.nextLine();

        checker.checkValidInput(numberInput);

    }
}