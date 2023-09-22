import java.util.*;
public class countDigit_alpha_spec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int alpha=0 , digit=0 , specialchar=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>=65 &&str.charAt(i)<=90 ||str.charAt(i)>=97 && str.charAt(i)<=122)
                alpha+=1;
            else if(str.charAt(i)>=48 && str.charAt(i)<=57)
                digit+=1;
            else
                specialchar+=1;
        }
        System.out.println("Alphabet: "+ alpha);
        System.out.println("digit: "+ digit);
        System.out.println("specialchar: "+ specialchar);
    }
}
