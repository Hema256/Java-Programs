
import java.util.Arrays;
import java.util.*;
class set{
    public static void main(String args[])
    {
        int x[]={1, 2, 2, 1, 3, 4, 3, 4, 1, 5, 3, 5,6};
        Arrays.sort(x);
        LinkedHashSet<Integer> set1 = new LinkedHashSet<Integer>();
        for(int i=0; i<13; i++)
        {
            set1.add(x[i]);
        }
        System.out.println(set1);

        
        
    }
}