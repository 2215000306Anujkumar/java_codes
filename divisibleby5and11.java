import java.util.*;
public class divisibleby5and11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any no to check whether it is divisible by 5 and 11");
        int num = sc.nextInt();
        if(num % 5==0 && num % 11==0){
            System.out.println("given number" + num + "is divisible by 5 and 11");
        }else
            System.out.println("given number"+ num +"is not divisible by 5 and 11");
    }
}
