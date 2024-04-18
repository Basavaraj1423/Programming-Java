package JavaBasicPrograms;

public class Palindrome {
    static void isPalindrome(String check){
        String rev="";
        for (int i = check.length()-1; i >= 0; i--) {
            rev=rev+check.charAt(i);
        }
        System.out.println(rev);
        if (rev.equalsIgnoreCase(check))
            System.out.println("The given String is a palindrome");
        else
            System.out.println("The given String is not a Palindrome");
    }

    public static void main(String[] args) {
        isPalindrome("RACECAR");
    }
}
