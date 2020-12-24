import java.util.Random;

public class QuickSort {
    public int[] quickSort(int[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        partition(array, 0, array.length - 1);
        return array;
    }

    private void partition(int[] array, int i, int j) {
        if (i >= j) {
            return;
        }
        int index = i;
        int pivot = array[index];
        swap(array, index, j);
        int left = i;
        int right = j - 1;
        while (left <= right) {
            if (array[left] < pivot) {
                left++;
            } else {
                swap(array, left, right);
                right--;
            }
        }
        swap(array, left, j);
        partition(array, i, left - 1);
        partition(array, left + 1, j);
    }

    private void swap(int[] array, int i, int j) {
        int num = array[i];
        array[i] = array[j];
        array[j] = num;
    }

    public static void main(String[] args) {
        QuickSort qs = new QuickSort();
        int[] a = {2,1,3,5,8,9,3,2,3,4,3,3,4};
        int[] res = qs.quickSort(a);
        System.out.print("This is the test for Quick Sort");
        for (int i : res) {
            System.out.println(i);
        }
    }
}
