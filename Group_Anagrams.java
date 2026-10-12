import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
//import java.util.Collection;
class Solution2 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<String> l=new ArrayList<String>();
        List<List<String>> result=new ArrayList<>();
       char[] c;
       String SortedS;
       Map<String, List<String>> map1=new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
            c=strs[i].toCharArray();
            Arrays.sort(c);
            SortedS=new String(c);
            if(!map1.containsKey(SortedS))
            {
                map1.put(SortedS, new ArrayList<>());
            }
            map1.get(SortedS).add(strs[i]);
            
        }
        return new ArrayList<>(map1.values());
    }
}


public class Group_Anagrams {
    public static void main(String[] args)
    {
       String[] strs = {"act","pots","tops","cat","stop","hat"};
       Solution2 so= new Solution2();
       List<List<String>> res= new ArrayList<>();
       res= so.groupAnagrams(strs);
       for(List i: res)
       {
        System.out.println(i);
       }
    }
}
