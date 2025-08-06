package project1;

public class Studentpasscheck {
	 public static void main(String[] args) {
	        int theory = 45;
	        int practical = 35;

	        if (theory >= 40 && practical >= 30) {
	            System.out.println("Student passed both theory and practical.");
	        } else {
	            System.out.println("Student failed.");
	        }
	    }

}
