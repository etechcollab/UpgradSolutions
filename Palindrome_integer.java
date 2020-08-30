public class Palindrome_integer {

    public static void main(String[] args) {
//Palindrome numbers are:101, 111, 121, 131, 141, 151, 161, 171, 181, 191, 202
        int num = 100, reversedInteger = 0, remainder, originalInteger;

        originalInteger = num;

        // reversed integer is stored in variable 
        while( num != 0 )
        {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num  /= 10;
        }

        // palindrome if orignalInteger and reversedInteger are equal
        if (originalInteger == reversedInteger)
            System.out.println(originalInteger + " is a palindrome.");
        else
            System.out.println(originalInteger + " is not a palindrome.");
    }
}