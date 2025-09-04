import java.util.HashMap;
import java.util.Set;

public class Maximum {
    public static void main(String[] args) {
        int nums[] = {1, 2, 4, 3, 5, 3, 3, 3, 3, 3};
        System.out.println(Majority_element(nums));
    }

    public static int Majority_element(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int val = nums[i];  
            if (hm.containsKey(val)) {
                hm.put(val, hm.get(val) + 1);
            } else {
                hm.put(val, 1);
            }
        }

    
        Set<Integer> keys = hm.keySet();
        for (int key : keys) {
            if (hm.get(key) > n / 2) {
                return key;
            }
        }

        return -1; 
    }
}
