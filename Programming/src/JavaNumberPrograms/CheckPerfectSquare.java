package JavaNumberPrograms;

public class CheckPerfectSquare {

    static boolean checkSquare(double number) {
        for (int i = 1; i * i <= number; i++) {
            if ((number % i == 0) && (number / i == i))
                return true;

        }
        return false;
    }

    public static void main(String[] args) {
        double number = 11;
        if (checkSquare(number))
            System.out.println("The Given number " + number + "  is a perfect square");
        else
            System.out.println("The Given number " + number + "  is a not perfect square");
    }
}
