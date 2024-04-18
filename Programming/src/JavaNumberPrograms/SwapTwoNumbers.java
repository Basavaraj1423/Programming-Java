package JavaNumberPrograms;


//Swap of two numbers using bitwise Operator.
public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a = 2, b = 1;
        System.out.println("Before Swapping :\n"+ "a = " + a+ "  b=" + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After Swapping :\n"+ "a = " + a+ "  b=" + b);

    }
}
