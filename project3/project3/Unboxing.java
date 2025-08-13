package project3;

public class Unboxing {
    public static void main(String[] args) {
        Integer obj = new Integer(100);

       
        int num = obj.intValue();

        System.out.println("Wrapper object: " + obj);
        System.out.println("Unboxed (Primitive) value: " + num);
    }
}
