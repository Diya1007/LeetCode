import java.util.HashMap;

class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        var map1=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(map1.containsKey(target-nums[i]))
            {
                return new int[] {i, map1.get(target-nums[i])};
            }
           else
           {
            map1.put(nums[i],i);
           }
        }
        return new int[] {0,0};
    }
}

public class Compare {

    public static void main(String[] args)
    {
        int[] nums = {3,4,5,6};
        int target = 7;
        Solution1 s= new Solution1();
        int ind[] = s.twoSum(nums,target);
        for(int i:ind)
        {
        System.out.println(i);
        }
    }
}
