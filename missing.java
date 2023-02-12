import java.util.Arrays;
import java.lang.Math;
public class missing {
    public static void main(String args[])
    {
        int x[]={1,2,4,5,6,8};
        Arrays.sort(x);
        for(int i=0; i<5; i++)
        {
            if(Math.abs(x[i]-x[i+1])>1)
            {
                 System.out.print(x[i]+1+" ");
            }
        }
    }
}
