package project2;

import java.util.Scanner;

public class Multiplicationtable {

	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");

	        int num = sc.nextInt();



	        for (int I = 1; I <= 10; I++) {

	            System.out.println(num + " x " + I + " = " + (num * I));

	        }

	    }



}