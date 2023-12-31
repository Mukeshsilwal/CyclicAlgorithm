package Sort.src;

public class CyclicSort {
   public int firstMissingPositiveNumber(int[] nums){
       int n=nums.length;
       for (int i = 0; i < n; i++) {
           if (nums[i] <= 0) {
               nums[i] = n + 1;
           }
       }
       for (int i = 0; i < n; i++) {
           if (Math.abs(nums[i]) <= n) {
               int index = Math.abs(nums[i]) - 1;
               if (nums[index] > 0) {
                   nums[index] = -nums[index];
               }
           }
       }
       for (int i = 0; i < n; i++) {
           if (nums[i] > 0) {
               return i + 1;
           }
       }
       return n+1;
   }

}
