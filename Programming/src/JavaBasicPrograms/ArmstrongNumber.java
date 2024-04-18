package JavaBasicPrograms;

public class ArmstrongNumber {
    public static void main(String[] args) {
            int no = 1535;
            int no1 = no;
            int copy = no;
            int count = 0;
            int sum = 0;

            while (no1 != 0) {
                no1 = no1 / 10;
                count++;
            }
            while (no != 0) {
                int rem = no % 10;
                sum = sum + (int) Math.pow(rem, count);
                no = no / 10;
            }
            if (copy == sum)
                System.out.println("Armstrong number");
            else
                System.out.println("Given Number is not Armstrong");
    }
}
