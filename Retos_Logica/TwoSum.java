package Retos_Logica;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {-500000000,2,4,-500000000};
        int target = -1000000000;

        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result)); // [0, 1]
    }

    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            System.out.println("i: " + nums[i]);
            for (int j = 0; j < nums.length; j++){
                System.out.println("j: " + nums[j]);
                if (nums[i] + nums[j] == target && i != j) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    // public static int[] twoSum(int[] nums, int target) {
    //     HashMap<Integer, Integer> map = new HashMap<>();

    //     for (int i = 0; i < nums.length; i++){
    //         System.out.println(i);
    //         map.put(nums[i], i);
    //     }
    //     System.out.println(map);
        
    //     for (int i = 0; i < nums.length; i++){
    //         int complemento = target - nums[i];
    //         System.out.println(complemento);

    //         if (map.containsKey(complemento)) {
    //             int j = map.get(complemento); // índice del complemento

    //             if (j != i) {

    //                 return new int[]{i, map.get(complemento)};
    //             }
    //         }
    //     }

        return null;
    }
}
