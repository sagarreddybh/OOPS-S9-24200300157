package project2;
import java.util.Scanner;

public class Acceptuntilzero {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            num = sc.nextInt();
            if (num == 0) break;
            System.out.println("You entered: " + num);
        }
        System.out.println("Program stopped.");
    }

}