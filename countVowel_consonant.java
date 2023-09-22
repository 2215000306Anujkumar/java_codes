import java.util.*;
public class countVowel_consonant {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.next();
        int countvowel=0 , countconso=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
                countvowel+=1;
            else if(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U')
                countvowel+=1;
            else
                countconso+=1;
        }
        System.out.println("count vowel: "+ countvowel);
        System.out.println("count consonant :"+ countconso);
    }
}
