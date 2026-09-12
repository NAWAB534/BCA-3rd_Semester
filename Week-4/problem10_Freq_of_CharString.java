import java.util.Scanner;
public class problem10_Freq_of_CharString{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String text = sc.nextLine();
        text = text.toLowerCase();
        int freq[] = new int[256];
        for(int i = 0; i<text.length(); i++){
            char ch = text.charAt(i);
            if(ch == ' '){
                continue;
            }
            freq[ch]++;
        }
        System.out.println("\nCharacter frequencies: ");
        for(int i = 0; i<freq.length; i++){
            if(freq[i]>0){
                System.out.println("'" +(char)i+ "' : " +freq[i]);
            }
        }
    }
}
