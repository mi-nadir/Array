public class Array {
    public static void main(String[] args) {
        int[] nums = new int[1000];
        for (int i=0;i<nums.length;i++) {
            nums[i] = i*10;
        }
        for (int i : nums) {
            System.out.println(i);
        }
    }
}
