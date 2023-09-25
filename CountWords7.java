import java.io.*;
import java.util.*;

public class CountWords7 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for(int i =0; i<s.length();i++){
            char ch = s.charAt(i);
            if(ch ==' '){
                count++;
            }
        }
        count = count + 1;
        System.out.println(count);

    }
}