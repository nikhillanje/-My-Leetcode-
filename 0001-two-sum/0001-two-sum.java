class Solution {
    public int[] twoSum(int[] nums, int target) {


        int [] newarray = new int [2];

        for(int i=0;i<=nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    newarray[0]=i;
                    newarray[1]=j;
                    break;
                }

            }
        }
        
        return newarray; 
    }
    
       
}
