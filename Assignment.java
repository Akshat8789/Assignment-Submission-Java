import java.util.Scanner;

public class Assignment {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any Number :- ");
        int num= scanner.nextInt();

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("Good Number");
        } else if (num % 3 == 0 && num % 5 != 0) {
            System.out.println("Bad Number");
        } else if (num % 3 != 0 && num % 5 == 0) {
            System.out.println("Poor Number");
        } else {
            System.out.println("-1");
        }

        scanner.close();
    }
}
