package project3;

public class Boxing {
    public static void main(String[] args) {
        int num = 50;

        
        Integer obj = Integer.valueOf(num);

        System.out.println("Primitive value: " + num);
        System.out.println("Boxed (Wrapper) value: " + obj);
    }
}
