import java.util.Scanner;

public class HCF {
        // Read two integers and print their HCF
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        // just to order them for the formual
        if (num2>num1){
            int temp = num1;
            num1 = num2;
            num2 = temp; 
        }
        // Eulers formula ->> 15, 5 => 15%5=0 => 5 is the HCF
        while(num1%num2>0){
            num2=num1%num2;
        }
        System.out.print(num2);
    }
}
