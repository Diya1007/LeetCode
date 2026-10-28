import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
 class Anagram {
    
    public List<Integer>  ana(String s, String p)
    {
        List<Integer> res= new ArrayList<>();
        int[] sArray= new int[26];
        int[] pArray= new int[26];
        for(int i=0;i<p.length();i++)
        {
            pArray[p.charAt(i)-'a']++;
            sArray[s.charAt(i)-'a']++;

        }
        if(Arrays.equals(pArray,sArray))
        {
            res.add(0);
        }

        for(int i=p.length();i<s.length();i++)
        {
            sArray[s.charAt(i)-'a']++;
            sArray[s.charAt(i-p.length())-'a']--;
              if(Arrays.equals(pArray,sArray))
        {
            res.add(i- p.length() +1);
            //System.out.println(sArray[i]+" "+s.charAt(i));
        }
        }
        return res;
    }
}

public class AllAnagram{
    public static void main(String[] args)
{
    String s="bcaefacba";
    String p="abc";
    Anagram a= new Anagram();
    List<Integer> res= new ArrayList<>();
    res= a.ana(s,p);
    for(int num: res)
        System.out.println(num);
}
}
