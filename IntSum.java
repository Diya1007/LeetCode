class Sol2 {
    public int[] twoSum(int[] numbers, int target) {
        int i=0, j= numbers.length -1;
        int sum;
        int[] res= new int[2];
        while(i<j)
        {
            sum= numbers[i]+numbers[j];
            if(sum== target)
                return new int[] {i+1,j+1};
            else if(sum< target)
            {
                i++;
            }
            else
            {
                j--;
            }
        } 
        return new int[0];
    }
}
public class IntSum {
    public static void main(String[] args)
{
    int[] n={1,2,3,4,5};
    int target=10;
    Sol2 s=new Sol2();
    int[] a=(s.twoSum(n,target));
    for(int i: a)
    {
        System.out.println(i);
    }
}
}
