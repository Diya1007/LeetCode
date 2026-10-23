import java.util.HashMap;
import java.util.Map;

class Container {
    public int maxArea(int[] heights) {
        int left=0, right= heights.length-1;
        int width=0, h=0, area=0, max=0;
       for(int i=0,j=heights.length-1;i<j;)
       {
            width=j-i;
            h= Math.min(heights[i],heights[j]);
            area= width * h;
           
            if (area> max)
                max= area;
             if(heights[i]< heights[j])
                i++;
            else
                j--;
       }
       return max;
    }
}

public class WaterContainer {
    public static void main(String[] args)
    {
        Container c= new Container();
        int[] level= {1,7,2,5,4,7,3,6};
        int res=c.maxArea(level);
        System.out.println(res);
    }
}
