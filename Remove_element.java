
class Remove_element{
    public static void main(String[] args) {
        
        int nums[] = {1,2,4,6,7,8};
        int val = 4;
        System.out.println(removeElement(nums,val));
    }
    public static int removeElement(int[] nums, int val) {
        
        int k = 0;
        for(int i = 0; i<nums.length;i++){
            if(nums[i]!=val){
                nums[k] = nums[i];
                k++;
            }
            
        
        }
        return k;
    
    }
}
