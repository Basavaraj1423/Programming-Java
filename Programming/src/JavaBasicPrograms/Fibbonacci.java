package JavaBasicPrograms;

public class Fibbonacci {


    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        int num3 = 0;
        int limit = 20;


        System.out.println("The required numbers are : ");
        for (int i = 0; i < limit; i++) {
            num3 = num1 + num2;
            System.out.print(num3 + " ");
            num1 = num2;
            num2 = num3;

        }
    }
}

