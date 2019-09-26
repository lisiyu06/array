import java.util.Arrays;

/**
 * Author: lisiyu
 * Created: 2019/9/23
 */
public class TestArray {

    static int count = 0;

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};

//        String str = Arrays.toString(arr);
        String str = toString(arr);
        System.out.println(str);

//        int[] ret = Arrays.copyOf(arr, arr.length);
        int[] ret = copy(arr);

        System.out.println(Arrays.toString(ret));

        int max = findMax(arr);
        System.out.println(max);

        double avg = toAvg(arr);
        System.out.println(avg);

        int finded = find(arr, 6);
        System.out.println(finded);

        int finded2 = binarySearch(arr, 6);
        System.out.println(finded2);
        System.out.println(count);

        System.out.println(isSorted(arr));

        int[] arr1 = {6, 3, 8, 1, 9};
        bubbleSort(arr1);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {7, 2, 9, 5, 4};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = {7, 2, 8, 5, 4};
        bubbleSort2(arr3);
        System.out.println(Arrays.toString(arr3));

        int[] arr5 = {1, 2, 8, 5, 4};
        reverse(arr5);
        System.out.println(Arrays.toString(arr5));

        int[] arr4 = {1, 3, 5, 6, 8, 2};
        arrange(arr4);
        System.out.println(Arrays.toString(arr4));

    }


    //数组数字排列
    //给定一个整型数组, 将所有的偶数放在前半部分, 将所有的奇数放在数组后半部分
    public static void arrange(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        while(left < right) {
            while(left<right && arr[left]/2 == 0) {
                left++;
            }
            while(left<right && arr[right]/2 != 0) {
                right--;
            }
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
    }

    //数组逆序
    public static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    //冒泡排序（逆序）
    public static void bubbleSort2(int[] arr) {
        for (int bound = arr.length-1; bound >= 0; bound--) {
            for (int cur = 0; cur < bound; cur++) {
                if (arr[cur] < arr[cur+1]) {
                    int temp = arr[cur];
                    arr[cur] = arr[cur+1];
                    arr[cur+1] = temp;
                }
            }
        }
    }

    //冒泡排序(升序)
    public static void bubbleSort(int[] arr) {
        for (int bound = 0; bound < arr.length; bound++) {
            for (int cur = arr.length-1; cur > bound; cur--) {
                if (arr[cur-1] > arr[cur]) {
                    int temp = arr[cur-1];
                    arr[cur-1] = arr[cur];
                    arr[cur] = temp;
                }
            }
        }
    }

    //检查数组的有序性
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i+1]) {
                return false;
            }
        }
        return true;

    }

    //二分查找
    public static int binarySearch(int[] arr, int toFind) {
        int left = 0;
        int right = arr.length-1;
        while(left <= right) {
            count++;
            int mid = (left + right) / 2;
            if(toFind < arr[mid]) {
                right = mid -1;
            } else if(toFind > arr[mid]){
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    //顺序查找数组中的元素
    public static int find(int[] arr, int toFind) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == toFind) {
                return i;
            }
        }
        return -1;
    }

    //求数组的平均值
    public static double toAvg(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double)sum / (double)arr.length;
    }

    //找到数组中的最大元素
    public static int findMax(int[] arr) {
        int max = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    //数组拷贝
    public static int[] copy(int[] arr) {
        int[] result = new int[arr.length];
        for(int i = 0;i < arr.length; i++) {
            result[i] = arr[i];
        }
        return result;
    }

    //数组转字符串
    public static String toString(int[] arr) {
        String ret = "[";
        for (int i = 0; i < arr.length; i++) {
            ret += arr[i];
            if (i != arr.length-1) {
                ret += ", ";
            }
        }
        ret += "]";
        return ret;
    }


}
