package JavaNumberPrograms;

public class FindGCD {
    public static void main(String[] args) {
        int a = 30 , b=50 , c = 0;
        for (int i = 1; i <= a && i<=b ; i++) {
            if (a%i==0 && b%i==0)
                c = i;

        }
        System.out.println("The Highest common factor of "+ a + " and " +b+ " is  " +c);
    }
}
