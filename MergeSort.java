public class MergeSort {
    public int[] mergeSort(int[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        return split(array, 0, array.length - 1);
    }

    public int[] split(int[] array, int left, int right) {
        if (right <= left) {
            return new int[]{array[left]};
        }

        int mid = left + (right - left) / 2;

        int[] leftPart = split(array, left, mid);
        int[] rightPart = split(array, mid + 1, right);

        return combine(leftPart, rightPart);
    }


/**
 * 
 * @param leftPart
 * @param rightPart
 * @return
 * 
 * {2,1,3,5}
 *    i
 * {2,7,4}
 *  j
 * 
 * {2,2, }
 *       k
 */


    public int[] combine(int[] leftPart, int[] rightPart) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] res = new int[]{leftPart.length + rightPart.length};
        while (i < leftPart.length && j < rightPart.length) {
            int left = leftPart[i];
            int right = rightPart[j];

            if (left <= right) {
                res[k] = left;
                i++;
            } else {
                res[k] = right;
                j++;
            }
            k++;
        }

        while (i < leftPart.length) {
            res[k] = leftPart[i];
            i++;
            k++;
        }

        while (j < rightPart.length) {
            res[k] = rightPart[j];
            i++;
            k++;
        }

        return res;
    }

    public static void main(String[] args) {
        int[] a = {2,1,3,5,8,9,3};
        MergeSort ms = new MergeSort();
        int[] res = ms.mergeSort(a);
        System.out.println(res);
    }
    
}
