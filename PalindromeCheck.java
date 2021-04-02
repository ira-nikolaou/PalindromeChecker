
public class PalindromeCheck
{
    // instance variables
    boolean numberValidation = false;
    String numberInput; 

    //A valid argument is a number in the range 1 to 999999999 (inclusive)
    String pattern = "[1-9]{1}[0-9]{0,8}";

    public void checkValidInput(String numberInput){
        if (numberInput.matches(pattern)){
            checkIfPalindrome(numberInput);
        } else {
            if (numberInput.equals("")){
                System.out.println("You did not provide a value"); 
            } else if (numberInput.length() > 9){
                System.out.println("You entered the value " + numberInput);
                System.out.println("Your value exceeds the maximum allowed character input");
            } else { 
                System.out.println("You entered the value " + numberInput);
                System.out.println("The value you provided does not match the required format");
            }
        }
    }

    public void checkIfPalindrome(String numberInput){
        int number = Integer.parseInt(numberInput);
        int numForReversing = number;
        int reversedNumber = 0;

        while(numForReversing != 0) {
            int numMod = numForReversing % 10;
            reversedNumber = reversedNumber * 10 + numMod;
            numForReversing /= 10;
        }

        System.out.println("You entered the number " + number);
        System.out.println("This reversed to " + reversedNumber); 

        if (number == reversedNumber) {
            System.out.println("Your number is a Palindrome"); 
        } else {
            System.out.println("Your number is NOT a Palindrome"); 
        }

    } 
}

