import java.util.ArrayList;
import java.util.HashSet;


class Sol5 {
    public int lengthOfLongestSubstring(String s) {
       HashSet<Character> hs= new HashSet<>();
       int left=0,i, maxlen=0;
       for(i=0;i<s.length();i++)
       {
        if(hs.contains(s.charAt(i)))
        {
            while(hs.contains(s.charAt(i)))
            {
                hs.remove(s.charAt(left));
            left ++;
            }
        }
        maxlen=Math.max(maxlen,i-left+1 );
        hs.add(s.charAt(i));
        }
        return (maxlen);
       }
    }

public class LongSubstring {
    public static void main(String[] args)
    {
        Sol5 s= new Sol5();
        String a= "pwwker";
       int len= s.lengthOfLongestSubstring(a);
       System.out.println(len);
    }
}
