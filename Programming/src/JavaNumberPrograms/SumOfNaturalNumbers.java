package JavaNumberPrograms;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int i, num = 10, sum = 0;
        for (i = 1; i < num; i++)
            sum += i;
        System.out.print("The sum of first 10 Natural Numbers : "+sum);
    }
}
