import java.util.Scanner;

public class Assignment {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any Number :- ");
        int num= scanner.nextInt();
        int n =num;
        int reverse=0;
        int d;
        while (n!=0) {
            d=n%10;
            reverse=(reverse*10)+d;
            n=n/10;
        }
        if(num==reverse)
        {
            System.out.println("Pallindrome Number");
        }
        else
        {
            System.out.println("Not Pallindrome Number");
        }
        
        scanner.close();
    }
}
