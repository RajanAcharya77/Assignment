import java.util.*;
public class QN35 {
    public static void main(String[] args) {
        int array[] = {12, 35, 1, 10, 34, 1};
        int n = array.length;
        Arrays.sort(array);
        System.out.println("sorted Array ::"+Arrays.toString(array));
        int res = array[n-2];
        System.out.println(" Second largest element is ::"+res);
    }
}
