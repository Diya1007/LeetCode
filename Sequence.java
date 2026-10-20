import java.util.HashSet;
class Solution6 {
    public int longestConsecutive(int[] nums) {
        int current=1,length=0,maxlength=0;
        HashSet<Integer> sortedNum= new HashSet<>();
        for(int n: nums)
        {
            sortedNum.add(n);
        }
        for(int n:sortedNum)
        {
            if(!sortedNum.contains(n-1))
            {
                length=1;
                current=n;
            }
            
            while (sortedNum.contains(current+1)) 
            {
                length++;
                current++;    
            }
            maxlength=Math.max(length,maxlength);
        }
        return maxlength;
    }
}

public class Sequence {
    public static void main(String[] args)
    {
        Solution6 s=new Solution6();
        int[] nums= {2,20,4,10,3,4,5}; //2,3,4,5,20,20
        System.out.println(s.longestConsecutive(nums));
    }
}
