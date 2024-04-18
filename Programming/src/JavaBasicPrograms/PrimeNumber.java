package JavaBasicPrograms;

public class PrimeNumber {
    static void primeNumbers(int count) {
        System.out.println("The prima numbers with in the limit of  " + count + "  are : ");
        for (int i = 2; i <= count; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime == true) {
                System.out.print( "  "+ i);
            }
        }
    }


    public static void main(String[] args) {
        primeNumbers(100);
    }

}
