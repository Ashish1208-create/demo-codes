import java.util.*;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        mergeSort(nums, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void mergeSort(int[] nums, int low, int high) {
        if (low >= high)
            return;

        int mid = (low + high) / 2;

        mergeSort(nums, low, mid);
        mergeSort(nums, mid + 1, high);

        merge(nums, low, mid, high);
    }

    public static void merge(int[] nums, int low, int mid, int high) {
        LinkedList<Integer> temp = new LinkedList<>();

        int left = low, right = mid + 1;
        int k = 0;

        while (left <= mid && right <= high) {
            if (nums[left] > nums[right]) {
                temp.add(nums[right]);
                right++;
            } else {
                temp.add(nums[left]);
                left++;
            }
        }

        while (left <= mid) {
            temp.add(nums[left]);
            left++;
        }
        while (right <= high) {
            temp.add(nums[right]);
            right++;
        }

        for (int i = 0; i < temp.size(); i++) {
            nums[low + i] = temp.get(i);
        }
    }
}