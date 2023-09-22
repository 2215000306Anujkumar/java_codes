import java.util.*;
public class checkPositive_negativeOrzero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        if(num>0){
            System.out.println("no is positive");
        } else if (num<0) {
            System.out.println("no is negative");
        }else
            System.out.println("no is zero");
    }
}
