import java.util.*;
public class sum_of_even_and_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int evensum =0;
        int n = sc.nextInt();
        for(int i =0; i<=n ; i=i+2){
           // if(i % 2==0)
            evensum = evensum + i;
        }
        System.out.println("sum of even no." + evensum);

          int oddsum=0;
        for(int i =1; i<=n ; i=i+2){
            oddsum = oddsum + i;
        }
        System.out.println("sum of odd no." + oddsum);
    }
}
