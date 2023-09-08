import java.util.*;
public class countno_of_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no.to count the digit :");
        int n= sc.nextInt();
        int count = (int)Math.log10(n)+1;
        System.out.println(count);
    }
}
