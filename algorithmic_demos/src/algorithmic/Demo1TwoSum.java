package algorithmic;

/**
 * @Classname Demo1TwoSum
 * @Description 两数之和
 * @Date 2020/6/3 21:36
 * @Author 曹珂
 */
public class Demo1TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    public static void main(String[] args) {
        int[] test = {2,7,11,15};
        int[] ints = new Demo1TwoSum().twoSum(test, 9);
        System.out.println(ints);
    }
}
