import java.util.*;
public class Armstrognumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int number=sc.nextInt();
        int originalno , remainder , result = 0  ;
        originalno = number;
        while(originalno != 0){
            remainder = originalno % 10;
            result += Math.pow(remainder , 3);
            originalno/= 10;

        }
        if(result == number){
            System.out.println("number is armstrong");
        }else{
            System.out.println("not armstrong16");
        }
    }
}
