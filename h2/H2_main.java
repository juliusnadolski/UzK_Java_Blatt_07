package h2;

import java.util.Arrays;

public class H2_main {

    public static void main(String[] args) {
        int[] array1 = {5, 1, 3, 2};
        int[] array2 = {5, 1, 3, 2};
        int[] array3 = {9, 8, 7};  

        System.out.println("Test 1 (Identisch, start=1, end=3):");
        int[] result1 = change(array1, array2, 1, 3);
        System.out.println(Arrays.toString(result1)); 

        System.out.println("Test 2 (Nicht identisch):");
        int[] result2 = change(array3, array2, 0, 2);
        System.out.println(Arrays.toString(result2));

        System.out.println("Test 3 (end <= start):");
        int[] result3 = change(array1, array2, 2, 2);
        System.out.println("Länge: " + result3.length); 
    }

    public static int[] change(int[] a, int[] b, int start, int end) {

        if (end <= start) {
            return new int[0];
        }

        boolean sindIdentisch = (Arrays.compare(a, b) == 0);

        if (!sindIdentisch) {
            return Arrays.copyOfRange(a, 0, a.length);
        } else {
            Arrays.sort(a);
            return Arrays.copyOfRange(a, start, end);
        }
    }
}
