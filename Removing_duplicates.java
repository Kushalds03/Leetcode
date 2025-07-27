public class Removing_duplicates{
    public static void main(String[] args) {
        int nums[] = {1,1,1,2,2,3,4,5,6,6};
        System.out.println("The number of elemetnts after remoning elements"+removeDuplicates(nums));
        
    }
     public static int removeDuplicates(int[] nums) {
         if (nums.length == 0) 
         return 0;

        int k = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
        
    }
}