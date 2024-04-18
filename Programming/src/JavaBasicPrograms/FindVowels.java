package JavaBasicPrograms;

public class FindVowels {
    public static void main(String[] args) {
        int count = 0;
        String val = "welcome";
        char[] arr = val.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u')
                count++;
        }
        System.out.println(count);
    }
}
