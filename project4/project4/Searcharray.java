package project4;

import java.util.Scanner;

public class Searcharray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50};

        System.out.print("Enter number to search: ");
        int search = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(search + " is found in the array.");
        } else {
            System.out.println(search + " is not found in the array.");
        }
    }
}
