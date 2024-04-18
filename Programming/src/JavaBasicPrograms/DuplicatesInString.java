package JavaBasicPrograms;

public class DuplicatesInString {
    public static void main(String[] args) {
        String val = "welcometomessippi";
        char[] arr = val.toCharArray();
        System.out.println("The duplicates are : ");
        System.out.println("Number | Frequency");
        for (int i = 0; i < arr.length; i++) {
            int count=1;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    count++;
                }
            }
            if(count>1)
                System.out.println(arr[i]+"     =>     "+count);

        }
    }
}

