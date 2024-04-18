package JavaNumberPrograms;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        int a = 20, b = 30, c = 40;
        int temp = a>b?a:b;
        int largest = c>temp?c:temp;
        System.out.println("The Largest of Three Number is : " +largest);
    }
}
