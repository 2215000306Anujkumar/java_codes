import java.io.*;
import java.util.*;

public class WordCapitalization {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String k,first;
        if(s.charAt(0)<=122 && s.charAt(0)>=97){
            first = s.substring(0,1);
            k=first.toUpperCase()+s.substring(1);
            System.out.println(k);
        } else
            System.out.println(s);

    }

}