import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
class Solution4 {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hmap=new HashMap<>();
        int [] arr= new int[k];
        for(int i:nums)
        {
            if(!hmap.containsKey(i))
            {
                hmap.put(i, 1);
            }
            else
            {
               int fre=hmap.get(i);
               hmap.put(i, fre+1);
            }
        }
        List<Map.Entry<Integer,Integer>> lm=new ArrayList<>(hmap.entrySet());
        lm.sort((a,b)-> b.getValue().compareTo(a.getValue()));
        for(int i=0;i<k;i++)
        {   
            arr[i]=lm.get(i).getKey();

        }
        return arr;
    }
}

public class Frequent {
    public static void main (String[] args)
    {
        int[] nums = {1,2,2,3,3,3};
        int k = 2;
        Solution4 s=new Solution4();
        int[] fre= s.topKFrequent(nums, k);
        for(int i:fre)
        {
            System.out.println(i);
        }

    }
}
