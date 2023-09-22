
public class compareNo_to_findMax {
    public static void main(String[] args) {
        int num1 = 25;
        int num2 = -15;
        int num3 = 3;
        if(num1>=num2 && num1>=num3){
            System.out.println(num1+"is the maximum no");
        } else if (num2>=num3 && num2>=num1) {
            System.out.println(num2+"is the maximum no");
        }else
            System.out.println(num3+"is the maximum no");
    }
}
