import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Sol3 {
    public List<List<Integer>> threeSum(int[] nums) {
        int left,right, fix,sum;
        List<List<Integer>> l1= new ArrayList<>() ;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++)
        {
            fix=nums[i];
            left=i+1;
            right=nums.length -1;
            while(left < right)
            {
                sum= nums[left]+nums[right];
                if( sum+fix == 0)
                {
                    if(! l1.contains(Arrays.asList(nums[left],nums[right],nums[i])))
                    {
                         l1.add(Arrays.asList(nums[left],nums[right],nums[i]));
                    }
                    left++;
                    right--;
                }
                else if(sum< -fix)
                    left++;
                else
                    right--;
            }
        }
        return l1;
    }
}

public class Sum3 {
    public static void main(String[] args)
    {
        int[] nums={-1,0,1,2,-1,-4};
        
        Sol3 s=new Sol3();
        List<List<Integer>> l1= new ArrayList<>() ;
       l1= s.threeSum(nums);
       System.out.print(l1);
    }
}
