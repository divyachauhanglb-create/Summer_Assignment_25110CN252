import java.util.Scanner;
public class Reverseofanumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int reverse = 0;
        if(num<=0){
            reverse=0;
        }
        else{
            while(num>0){
                int digit = num%10;
                reverse = reverse*10 + digit;
                num = num/10;
            }
        }
        System.out.println("The reverse of the number is: " + reverse); 
        sc.close(); 
    }
}