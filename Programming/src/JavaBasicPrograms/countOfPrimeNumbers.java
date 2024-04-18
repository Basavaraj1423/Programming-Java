package JavaBasicPrograms;

public class countOfPrimeNumbers {

    static void primeNumbers(int start, int end) {

        System.out.println("The prime numbers betwee -n " + start + "  and  " + end + " are ");
        System.out.print("The values are");
        for (int i = start; i <= end; i++) {

            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime == true) {
                System.out.print(" " + i);

            }
        }


    }


    public static void main(String[] args) {
        primeNumbers(2, 10);
    }
}
