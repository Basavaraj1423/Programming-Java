package JavaBasicPrograms;

public class Factorial {

    public static void main(String[] args) {
        int c = 1;
        int num = 5;
        for (int i = num; i >= 1; i--) {
            c = c * i;
        }

        System.out.println("The Factorial of " +num+ " is " +c);

    }
}
