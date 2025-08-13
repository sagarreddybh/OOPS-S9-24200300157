package project4;

public class Removedupes {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 30, 10, 40, 50, 30};
        int n = arr.length;

        System.out.println("Unique elements:");
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                System.out.println(arr[i]);
            }
        }
    }
}

