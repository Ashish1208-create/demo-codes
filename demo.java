import java.util.*;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        int t = sc.nextInt();

        while (t-- > 0) {
            int[] query = new int[2];
            query[0] = sc.nextInt();
            query[1] = sc.nextInt();

            HashMap<Integer, Integer> temp = new HashMap<>();

            if(query[0] < n && query[0] >= 0 && query[1] < n && query[1] >= 0){
                for(int i=query[0]; i<=query[1]; i++){
                    temp.put(nums[i], (temp.getOrDefault(nums[i], 0) + 1));
                }
            }

            int sum =0;

            for (Map.Entry<Integer, Integer> entry : temp.entrySet()) {
                sum += entry.getValue()*entry.getValue();
                // System.out.println(entry.getKey() + " " + entry.getValue());
            }
            System.out.println(sum);
        }
    }
}