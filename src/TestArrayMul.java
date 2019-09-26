/**
 * Author: lisiyu
 * Created: 2019/9/23
 */
public class TestArrayMul {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        int[] newarr = mul(arr);
        printArray(newarr);

    }

    public static int[] mul(int[] arr) {
        int[] ret = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            ret[i] = arr[i] * 2;
        }
        return ret;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
