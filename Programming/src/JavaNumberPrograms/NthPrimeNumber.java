package JavaNumberPrograms;

public class NthPrimeNumber {

    public static void main(String[] args) {
        int num = 1, count = 0, i, n = 10;
        while (count < n) {
            num = num + 1;
            for (i = 2; i < num; i++) {
                if (num % i == 0) {
                    break;
                }

            }
            if (i == num)
                count = count + 1;
        }
        System.out.println("The " + n + "th Prime number is : " + num);
    }
}
