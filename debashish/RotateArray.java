class Solution {
    public void rotate(int[] nums, int k) {
        int i=0;
        while(k>0){
            if(nums.length==1){
                break;}
            else{
            int temp=nums[0];
            nums[0]=nums[nums.length-1];
        
        for(i=nums.length-2;i>=1;i--){
            nums[i+1]=nums[i];   
        }
            nums[i+1]=temp;}
            k-=1;
        }
        //return nums;
        
        
        
    }
}
