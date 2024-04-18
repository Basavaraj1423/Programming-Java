package JavaBasicPrograms;

public class PalindromeWithoutInbuilt {

    static boolean isPalindrome(String check) {
        char[] toArray = check.toCharArray();
        int i=0;
        int j = check.length()-1;
        while (i <= j){
            if(toArray[i]!=toArray[j])
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {


        boolean result = isPalindrome("RACEHCAR");
        if (result == true)
            System.out.println("The given String is a palindrome");
        else
            System.out.println("The given String is not a Palindrome");

    }
}
