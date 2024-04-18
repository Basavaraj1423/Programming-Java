package JavaNumberPrograms;

public class EvenAndOddNumbers {
    public static void main(String[] args) {
        System.out.println("The Even Numbers from 1 to 100 : ");
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("The Odd Numbers from 1 to 100 : ");
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0)
                System.out.print(i + " ");
        }
    }
}
