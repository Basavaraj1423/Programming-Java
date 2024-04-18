package JavaNumberPrograms;


//  Confused about the do while loop. clarify it asap.

public class FindSquareRoot {
    static int c=0;
    static int squareRoot(int num) {
        int temp;
        int sqrtroot = num / 2;
        do {
            temp = sqrtroot;
            sqrtroot = (temp + (num / temp)) / 2;
            c++;
            System.out.println(c);
        } while (temp - sqrtroot != 0);
        return sqrtroot;
    }
    public static void main(String[] args) {
        System.out.println("Square root of the given number is : " + squareRoot(25));
        System.out.println(c);
    }
}
