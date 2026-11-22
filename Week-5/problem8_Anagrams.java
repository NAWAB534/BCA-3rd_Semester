import java.util.Scanner;
import java.util.Arrays;
public class problem8_Anagrams {
    public static boolean isAnagram(String str1, String str2){
        str1 = str1.toLowerCase().replaceAll("\\s","");
        str2 = str2.toLowerCase().replaceAll("\\s","");
        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string 1: ");
        String str1 = sc.nextLine();
        System.out.print("Enter string 2: ");
        String str2 = sc.nextLine();
        if(isAnagram(str1, str2)){
            System.out.println("Strings " +str1+ " and " +str2+ " are anagrams.");
        }
        else{
            System.out.println("Strings " +str1+ " and " +str2+ " are not anagrams.");
        }
    }
}
